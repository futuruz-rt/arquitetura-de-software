package com.lucasrocha.arquitetura.model;

public enum FontesFosforo {
    SUPERFOSFATO_SIMPLES(18.0),
    SUPERFOSFATO_TRIPLO(41.0),
    MAP(48.0),
    DAP(45.0),
    TERMOFOSTATO_YOORIN(18.0),
    FOSFATO_ARAD(33.0),
    FOSFATO_GAFSA(29.0),
    FOSFATO_DAOUI(32.0),
    FOSFATO_NAT_PATOS_MINAS(24.0),
    ESCORIA_THOMAS(18.5),
    ACIDO_FOSFORICO(52.0),
    MULTIFOSFATO_MAGNESIANO(18.0);

    private double valorFosforo;

    FontesFosforo(double valorFosforo) {
        this.valorFosforo = valorFosforo;
    } 

    public double getValorFosforo() {
        return valorFosforo;
    }
    
    
}
