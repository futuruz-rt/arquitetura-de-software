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
        return this.ecc.getPotassio()
                / (this.ecc.getCalcio() + this.ecc.getMagnesio() + this.ecc.getPotassio()
                + this.ecc.getAcidezPotencial()) * 100;
    }

    public double participacaoPotassioPercentualIdeal() {
        return 3.0;
    }

    public double participacaoPotassioCorrecao() {
        return this.participacaoPotassio > 0.001 ? this.participacaoPotassio : 0.0;
    }

    public double quantidadeAplicarPotassio() {
        double necessidadeAdicionar = this.ecc.getPotassio()
                * this.participacaoPotassio / this.participacaoPotassioAtual()
                - this.ecc.getPotassio();
        
        return necessidadeAdicionar < 0.0 ? 0.0 : necessidadeAdicionar * 39.1 * 10 * 2 * 1.2 * 100 / 0.85
                / fontePotassio.getValorPotassio();
    }

    public ForneceCorrecao forneceCorrecaoPotassioUm() {
        return this.fontePotassio.getCorrecaoPotassioUm(this.quantidadeAplicarPotassio());

    }

    public ForneceCorrecao forneceCorrecaoPotassioDois() {
        return this.fontePotassio.getCorrecaoPotassioDois(this.quantidadeAplicarPotassio());
    }

    public double custoAlqueirePotassio() {
        return (this.valorFontePotassio * this.quantidadeAplicarPotassio() / 1000);
    }

}
