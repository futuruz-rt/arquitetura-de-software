package com.lucasrocha.arquitetura.model;

public enum FontesPotassio {
    CLORETO_POTASSIO(58.0),
    SULFATO_POTASSIO(52.0),
    SULFATO_POTASSIO_MAGNESIO(22.0);

    public double valorFontePotassio;

    FontesPotassio(double valorFontePotassio) {
        this.valorFontePotassio = valorFontePotassio;
    }

    public double getValorPotassio() {
        return valorFontePotassio;
    }
}
