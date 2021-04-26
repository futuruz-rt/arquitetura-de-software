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

    public double quantidadeFosforoAplicar() {
        double faltante = this.teorFosforoMeta - this.ecc.getFosforo();
        double quantidadeAplicar = (faltante * 2 * 2.29)
                / (this.eficienciaFosforo / 100) * (100 / fonteFosforo.getValorFosforo());
        return faltante > 0.01 ?  quantidadeAplicar : 0.0;
    }

    public ForneceCorrecao forneceCorrecaoFosforo() {
         return this.fonteFosforo.getCorrecaoFosforo(this.quantidadeFosforoAplicar());
    }

    public double custoFosforoAlqueire() {
        return (this.valorFonteFosforo * this.quantidadeFosforoAplicar() / 1000);
    }
}
