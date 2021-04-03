package com.lucasrocha.arquitetura.model;

public class CorrecaoFosforo {

    private double teorFosforoMeta;
    private FontesFosforo fonteFosforo;
    private double eficienciaFosforo;
    private double valorFonteFosforo;
    private EquilibrioCorrecaoCTC ecc;

    public CorrecaoFosforo(double teorFosforoMeta, FontesFosforo fonteFosforo, double eficienciaFosforo, double valorFonteFosforo, EquilibrioCorrecaoCTC ecc) {
        this.teorFosforoMeta = teorFosforoMeta;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.valorFonteFosforo = valorFonteFosforo;
        this.ecc = ecc;
    }

    public double quantidadeFosforoAplicacao() {
        double faltante = this.teorFosforoMeta - this.ecc.getFosforo();
        double quantidadeAplicar = (faltante * 2 * 2.29)
                / (this.eficienciaFosforo / 100) * (100 / fonteFosforo.getValorFosforo());
        if (faltante > 0.01) {
            return quantidadeAplicar;
        } else {
            return 0.0;
        }
    }

    public ForneceCorrecao forneceCorrecaoFosforoUm() {
        double itemValor;
        switch (this.fonteFosforo) {
            case TERMOFOSTATO_YOORIN:
                itemValor = this.quantidadeFosforoAplicacao() * 0.15;
                return new ForneceCorrecao(itemValor, Nutrientes.MAGNESIO);
            case SUPERFOSFATO_SIMPLES:
                itemValor = this.quantidadeFosforoAplicacao() * 0.1;
                return new ForneceCorrecao(itemValor, Nutrientes.ENXOFRE);
            case MULTIFOSFATO_MAGNESIANO:
                itemValor = this.quantidadeFosforoAplicacao() * 0.11;
                return new ForneceCorrecao(itemValor, Nutrientes.ENXOFRE);
            default:
                return null;
        }
    }

    public ForneceCorrecao forneceCorrecaoFosforoDois() {
        double itemValor;

        if (this.fonteFosforo == FontesFosforo.SUPERFOSFATO_SIMPLES
                || this.fonteFosforo == FontesFosforo.TERMOFOSTATO_YOORIN
                || this.fonteFosforo == FontesFosforo.FOSFATO_NAT_PATOS_MINAS) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.28;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.SUPERFOSFATO_TRIPLO) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.2;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.MAP) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.09;
            return new ForneceCorrecao(itemValor, Nutrientes.NITROGENIO);
        }

        if (this.fonteFosforo == FontesFosforo.DAP) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.16;
            return new ForneceCorrecao(itemValor, Nutrientes.NITROGENIO);
        }

        if (this.fonteFosforo == FontesFosforo.FOSFATO_ARAD
                || this.fonteFosforo == FontesFosforo.FOSFATO_GAFSA) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.52;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.FOSFATO_DAOUI) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.45;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.ESCORIA_THOMAS) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.44;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.ACIDO_FOSFORICO) {
            return new ForneceCorrecao(0, null);
        }

        if (this.fonteFosforo == FontesFosforo.MULTIFOSFATO_MAGNESIANO) {
            itemValor = this.quantidadeFosforoAplicacao() * 0.18;
            return new ForneceCorrecao(itemValor, Nutrientes.CALCIO);
        }
        return null;

    }

    public double custoFosforoAlqueire() {
        return (this.valorFonteFosforo * this.quantidadeFosforoAplicacao() / 1000);
    }
}
