package com.lucasrocha.arquitetura.model;

public class ForneceCorrecao {

    private double valor;
    private Nutrientes descricao_item;

    public ForneceCorrecao(double valor, Nutrientes descricao_item) {
        this.valor = valor;
        this.descricao_item = descricao_item;
    }

    public double getValor() {
        return valor;
    }

    public Nutrientes getDescricao_item() {
        return descricao_item;
    }

}
