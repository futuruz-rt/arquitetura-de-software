package com.lucasrocha.arquitetura.model;

public class CorrecaoPotassio {

    private double participacaoPotassio;
    private EquilibrioCorrecaoCTC ecc;
    private FontesPotassio fontePotassio;
    private double valorFontePotassio;

    public CorrecaoPotassio(double participacaoPotassio, EquilibrioCorrecaoCTC ecc, FontesPotassio fontePotassio, double valorFontePotassio) {
        this.participacaoPotassio = participacaoPotassio;
        this.ecc = ecc;
        this.fontePotassio = fontePotassio;
        this.valorFontePotassio = valorFontePotassio;
    }

    public double participacaoPotassioAtual() {
        double participacao = this.ecc.getPotassio()
                / (this.ecc.getCalcio() + this.ecc.getMagnesio() + this.ecc.getPotassio()
                + this.ecc.getAcidezPotencial()) * 100;
        return participacao;
    }

    public double participacaoPotassioPercentualIdeal() {
        return 3.0;
    }

    public double participacaoPotassioCorrecao() {
        if (this.participacaoPotassio > 0.001) {
            return this.participacaoPotassio;
        } else {
            return 0.0;
        }
    }

    public double valorFontePotassio() {
        switch (this.fontePotassio) {
            case CLORETO_POTASSIO:
                return 58.0;
            case SULFATO_POTASSIO:
                return 52.0;
            case SULFATO_POTASSIO_MAGNESIO:
                return 22.0;
            default:
                return 0.0;
        }
    }

    public double quantidadeAplicarPotassio() {
        double necessidadeAdicionar = this.ecc.getPotassio()
                * this.participacaoPotassio / this.participacaoPotassioAtual()
                - this.ecc.getPotassio();
        if (necessidadeAdicionar < 0.01) {
            return 0.0;
        } else {
            return necessidadeAdicionar * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 / 100 * 100
                    / this.valorFontePotassio();
        }
    }

    public ForneceCorrecao forneceCorrecaoPotassioUm() {
        double itemValor = 0;
        switch (this.fontePotassio) {
            case SULFATO_POTASSIO:
                itemValor = this.quantidadeAplicarPotassio() * 0.17;
                return new ForneceCorrecao(itemValor, Nutrientes.ENXOFRE);
            case SULFATO_POTASSIO_MAGNESIO:
                itemValor = this.quantidadeAplicarPotassio() * 0.22;
                return new ForneceCorrecao(itemValor, Nutrientes.ENXOFRE);
            default:
                return null;
        }
    }

    public ForneceCorrecao forneceCorrecaoPotassioDois() {
        double itemValor;
        switch (this.fontePotassio) {
            case SULFATO_POTASSIO_MAGNESIO:
                itemValor = this.quantidadeAplicarPotassio() * 0.18;
                return new ForneceCorrecao(itemValor, Nutrientes.MAGNESIO);
            default:
                return null;
        }
    }

    public double custoAlqueirePotassio() {
        return (this.valorFontePotassio * this.quantidadeAplicarPotassio() / 1000);
    }

}
