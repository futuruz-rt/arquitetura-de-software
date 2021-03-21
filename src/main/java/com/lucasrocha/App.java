package com.lucasrocha.arquitetura;

import com.lucasrocha.arquitetura.model.Analise;
import com.lucasrocha.arquitetura.model.Elementos;
import java.util.Scanner;

/**
 *
 * @author kzito
 */
public class App {

    public static void main(String[] args) {
        App app = new App();
        Analise analisesolo = new Analise();
        Elementos elementos = new Elementos();
        //leitura dos elementos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade para os elementos da analise: ");

        System.out.println("\nInforme a textetura do solo (1 - Argiloso; 2 - Textura média): ");
        elementos.setTexturaSolo(teclado.nextInt());

        System.out.println("\nSistema de Cultivo: 1 - Plantio Direto || 2 - Convencional ");
        analisesolo.setSistemaCultivo(teclado.nextInt());

        //------
        System.out.println("\nResponsável Técnico: ");
        analisesolo.setRespTecnico(teclado.next());

        System.out.println("\nProfundidade da amostra: ");
        analisesolo.setProfundidadeAmostraCm(teclado.nextDouble());

        System.out.println("\nAnalise de solo nº: ");
        analisesolo.setResultadoAnalise(teclado.nextInt());
        //----

        System.out.println("\nQuantidade de fósforo (mg.dm3 | mehlich): ");
        elementos.setFosforo(teclado.nextDouble());

        System.out.println("\nQuantidade de potássio (cmol): ");
        elementos.setPotassio(teclado.nextDouble());

        System.out.println("\nQuantidade de cálcio (cmol): ");
        elementos.setCalcio(teclado.nextDouble());

        System.out.println("\nQuantidade de magnésio (cmol): ");
        elementos.setMagnesio(teclado.nextDouble());

        System.out.println("\nQuantidade de Enxofre (mg.dm³): ");
        elementos.setEnxofre(teclado.nextDouble());

        System.out.println("\nQuantidade de aluminio: ");
        elementos.setAluminio(teclado.nextDouble());

        System.out.println("\nQuantidade de H+AL: ");
        elementos.sethAl(teclado.nextDouble());

        //COMPARAÇÃO DOS DADOS INFORMADOS COM OS DADOS IDEAIS
        System.out.println("Teste de Exemplo");

        System.out.println("\nFosforo atual: " + elementos.getFosforo() + " Fosforo ideal: " + elementos.getFosforoIdeal());
        System.out.println("\nPotassio atual:: " + elementos.getPotassio() + " Potassio ideal: " + elementos.getPotassioIdeal());
        System.out.println("\nCalcio atual: " + elementos.getCalcio() + " Calcio ideal: " + elementos.getCalcioIdeal());
        System.out.println("\nMagnesio atual: " + elementos.getMagnesio() + " Potassio ideal: " + elementos.getMagnesioIdeal());
        System.out.println("\nEnxofre atual: " + elementos.getEnxofre() + " Enxofre ideal: " + elementos.getEnxofreIdeal());
        System.out.println("\nAluminio atual: " + elementos.getAluminio() + " Aluminio ideal: " + elementos.getAluminioIdeal());
        // public double calculaSCmol(double potassio, double calcio, double magnesio) {
        System.out.println("S cmol: " + elementos.calcularSCMol(elementos.getPotassio(), elementos.getCalcio(), elementos.getMagnesio()));
        //public double calculaCTCCmol(double potassio, double calcio, double magnesio, double aluminio) {
        System.out.println("CTC cmol: " + elementos.calcularCTCCmol(elementos.getPotassio(), elementos.getCalcio(), elementos.getMagnesio(), elementos.getAluminio()));
        //public double calculaVAtual(double potassio, double calcio, double magnesio, double aluminio)
        System.out.println("v% atual: " + elementos.calcularVAtual(elementos.getPotassio(), elementos.getCalcio(), elementos.getMagnesio(), elementos.getAluminio()));
    }

}
