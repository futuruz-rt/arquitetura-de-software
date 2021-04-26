package com.lucasrocha.arquitetura.model;

public enum FontesFosforo {
    //valores enum
    SUPERFOSFATO_SIMPLES(18.0) {
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao(((quantidadeAplicacao * 0.1)), Nutrientes.ENXOFRE);
        };        
    },
    SUPERFOSFATO_TRIPLO(41.0){
     @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.2), Nutrientes.CALCIO) ;
        };    
    },
    MAP(48.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.09), Nutrientes.NITROGENIO) ;
        };    
    },
    DAP(45.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.16), Nutrientes.NITROGENIO) ;
        };
    },
    TERMOFOSTATO_YOORIN(18.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.15), Nutrientes.MAGNESIO) ;
        };
        
    },
    FOSFATO_ARAD(33.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.52), Nutrientes.CALCIO) ;
        };
    },
    FOSFATO_GAFSA(29.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.52), Nutrientes.CALCIO) ;
        };
    },
    FOSFATO_DAOUI(32.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.45), Nutrientes.CALCIO) ;
        };
    },
    FOSFATO_NAT_PATOS_MINAS(24.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.28), Nutrientes.CALCIO) ;
        };
    },
    ESCORIA_THOMAS(18.5){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.44), Nutrientes.CALCIO) ;
        };
    },
    ACIDO_FOSFORICO(52.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao(0.0, null) ;
        };
    },
    MULTIFOSFATO_MAGNESIANO(18.0){
        @Override
        public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
            return new ForneceCorrecao((quantidadeAplicacao * 0.11), Nutrientes.ENXOFRE) ;
        };        
    };

    private double valorFosforo;

    FontesFosforo(double valorFosforo) {
        this.valorFosforo = valorFosforo;
    }

    public double getValorFosforo() {
        return valorFosforo;
    }

    public ForneceCorrecao getCorrecaoFosforo(double quantidadeAplicacao) {
        return null;
    }
    
}
