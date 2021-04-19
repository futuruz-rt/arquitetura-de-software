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
        switch (this.fonteFosforo) {
            case TERMOFOSTATO_YOORIN:
                return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.15, Nutrientes.MAGNESIO);
            case SUPERFOSFATO_SIMPLES:
                return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.1, Nutrientes.ENXOFRE);
            case MULTIFOSFATO_MAGNESIANO:
                return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.11, Nutrientes.ENXOFRE);
            default:
                return null;
        }
    }

    public ForneceCorrecao forneceCorrecaoFosforoDois() {
        if (this.fonteFosforo == FontesFosforo.SUPERFOSFATO_SIMPLES
                || this.fonteFosforo == FontesFosforo.TERMOFOSTATO_YOORIN
                || this.fonteFosforo == FontesFosforo.FOSFATO_NAT_PATOS_MINAS) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.28, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.SUPERFOSFATO_TRIPLO) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.2, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.MAP) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.09, Nutrientes.NITROGENIO);
        }

        if (this.fonteFosforo == FontesFosforo.DAP) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.16, Nutrientes.NITROGENIO);
        }

        if (this.fonteFosforo == FontesFosforo.FOSFATO_ARAD
                || this.fonteFosforo == FontesFosforo.FOSFATO_GAFSA) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.52, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.FOSFATO_DAOUI) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.45, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.ESCORIA_THOMAS) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.44, Nutrientes.CALCIO);
        }

        if (this.fonteFosforo == FontesFosforo.ACIDO_FOSFORICO) {
            return new ForneceCorrecao(0, null);
        }

        if (this.fonteFosforo == FontesFosforo.MULTIFOSFATO_MAGNESIANO) {
            return new ForneceCorrecao(this.quantidadeFosforoAplicacao() * 0.18, Nutrientes.CALCIO);
        }
        return null;
    }

    public double custoFosforoAlqueire() {
        return (this.valorFonteFosforo * this.quantidadeFosforoAplicacao() / 1000);
    }
}
