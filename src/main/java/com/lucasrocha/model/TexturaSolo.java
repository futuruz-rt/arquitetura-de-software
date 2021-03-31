package com.lucasrocha.arquitetura.model;

public enum TexturaSolo {
    ARGILOSO(1),
    TEXTURA_MEDIA(2);

    private int codigo;

    TexturaSolo(int codigo) {
        this.codigo = codigo;
    }

    int getCodigo() {
        return this.codigo;
    }
}
