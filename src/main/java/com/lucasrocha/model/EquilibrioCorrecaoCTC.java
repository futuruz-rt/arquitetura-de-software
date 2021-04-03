package com.lucasrocha.arquitetura.model;
//Parte do código foi retirado do Gabriel Costa Silva, disponível no link: https://github.com/gabrielcostasilva/sa-soilcorrection
public class EquilibrioCorrecaoCTC {

    private TexturaSolo texturaSolo;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hAl;
    private double acidezPotencial;
    private double mo;

    public EquilibrioCorrecaoCTC(TexturaSolo texturaSolo, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double acidezPotencial, double mo) {
        this.texturaSolo = texturaSolo;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.acidezPotencial = acidezPotencial;
        this.mo = mo;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double getAcidezPotencial() {
        return acidezPotencial;
    }

    public double getMo() {
        return mo;
    }

    public double getFosforoIdeal() {
        switch (this.texturaSolo) {
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 12.0;
            default:
                return 0.0;
        }
    }

    public double getPotassioIdeal() {
        switch (this.texturaSolo) {
            case ARGILOSO:
                return 0.35;
            case TEXTURA_MEDIA:
                return 0.25;
            default:
                return 0.0;
        }
    }

    public double getCalcioIdeal() {
        switch (this.texturaSolo) {
            case ARGILOSO:
                return 6.0;
            case TEXTURA_MEDIA:
                return 4.0;
            default:
                return 0.0;
        }
    }

    public double getMagnesioIdeal() {
        switch (this.texturaSolo) {
            case ARGILOSO:
                return 1.5;
            case TEXTURA_MEDIA:
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double getEnxofreIdeal() {
        switch (this.texturaSolo) {
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 6.0;
            default:
                return 0.0;
        }
    }

    public double getAluminioIdeal() {
        return 0.0;
    }

    public double calcularSCmol(
            double potassio,
            double calcio,
            double magnesio) {

        return potassio + calcio + magnesio;
    }

    public double calcularCTCCmol(
            double potassio,
            double calcio,
            double magnesio,
            double hidrogenioAluminio) {

        return calcularSCmol(potassio, calcio, magnesio) + hidrogenioAluminio;
    }

    public double calculaVPercentual(double Scmol, double CTCcmol) {
        if (Scmol > 0 && CTCcmol > 0) {
            return Scmol / CTCcmol * 100;
        } else {
            return 0.0;
        }
    }

    public double calcularMOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;

        } else {
            return 0.0;
        }
    }

    public double calcularCarbono(double moPercentual) {
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;

        } else {
            return 0.0;
        }
    }
}
