package com.lucasrocha.arquitetura.model;

public class Elementos {
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hAl;
    private int texturaSolo;
    private double acidezPotencial;

    //métodos SET e GET
    public double getFosforo() {
        return fosforo;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }

    public double gethAl() {
        return hAl;
    }

    public void sethAl(double hAl) {
        this.hAl = hAl;
    }
    //

    //comparar os valores atuais com os ideais
    public void setTexturaSolo(int texturaSolo) {
        this.texturaSolo = texturaSolo;
    }

    public double getFosforoIdeal() {
        if (this.texturaSolo == 1) {
            return 9.0;
        } else if (this.texturaSolo == 2) {
            return 12.0;
        }
        return 0.0;
    }

    public double getPotassioIdeal() {
        if (this.texturaSolo == 1) {
            return 0.35;
        } else if (this.texturaSolo == 2) {
            return 0.25;
        }
        return 0.0;
    }

    public double getCalcioIdeal() {
        if (this.texturaSolo == 1) {
            return 6.0;
        } else if (this.texturaSolo == 2) {
            return 4.0;
        }
        return 0.0;
    }

    public double getMagnesioIdeal() {
        if (this.texturaSolo == 1) {
            return 1.5;
        } else if (this.texturaSolo == 2) {
            return 1.0;
        }
        return 0.0;
    }

    public double getEnxofreIdeal() {
        if (this.texturaSolo == 1) {
            return 9.0;
        } else if (this.texturaSolo == 2) {
            return 6.0;
        }
        return 0.0;
    }

    public double getAluminioIdeal() {
        return 0.0;
    }

    public double getHAl() {
        return 0.0;
    }

    //calculo elementos atual
    public double calcularSCMol(double potassio, double calcio, double magnesio) {
        return potassio + calcio + magnesio; //ok
    }

    public double calcularCTCCmol(double potassio, double calcio, double magnesio, double aluminio) {
        return potassio + calcio + magnesio + aluminio;
    }

    public double calcularVAtual(double potassio, double calcio, double magnesio, double aluminio) {
        double scmol = potassio + calcio + magnesio;
        double ctccmol = potassio + calcio + magnesio + aluminio;
        return (scmol * 100) / ctccmol;
    }
    
}
