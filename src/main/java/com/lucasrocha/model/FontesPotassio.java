package com.lucasrocha.arquitetura.model;

public enum FontesPotassio {
    
    CLORETO_POTASSIO(58.0),
    SULFATO_POTASSIO(52.0) {
        @Override
        public ForneceCorrecao getCorrecaoPotassioUm(double quantidadeAplicacao) {
            return new ForneceCorrecao(quantidadeAplicacao * 0.17, Nutrientes.ENXOFRE);  
        };
    },
    SULFATO_POTASSIO_MAGNESIO(22.0) {
        @Override
        public ForneceCorrecao getCorrecaoPotassioUm(double quantidadeAplicacao) {
            return new ForneceCorrecao(quantidadeAplicacao * 0.22, Nutrientes.ENXOFRE); 
        };
        @Override
        public ForneceCorrecao getCorrecaoPotassioDois(double quantidadeAplicacao) {
            return new ForneceCorrecao(quantidadeAplicacao * 0.18, Nutrientes.MAGNESIO);  
        }
    };   
    
    public double valorFontePotassio;

    FontesPotassio(double valorFontePotassio) {
        this.valorFontePotassio = valorFontePotassio;
    }

    public double getValorPotassio() {
        return valorFontePotassio;
    }
    
     public ForneceCorrecao getCorrecaoPotassioUm(double quantidadeAplicacao) {
        return null;
    }
    
     public ForneceCorrecao getCorrecaoPotassioDois(double quantidadeAplicacao) {
        return null;
    }
}
