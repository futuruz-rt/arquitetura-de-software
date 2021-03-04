package com.lucasrocha;
import model.Elementos;
import model.Analise;
public class App
{
    public static void main( String[] args )
    {
        App app = new App();
	Analise analisesolo = new Analise();
    	Elementos elementos = new Elementos();
	//leitura dos elementos
	Scanner teclado = new Scanner(System.in);		
	System.out.println("Informe a quantidade para os elementos da analise:");	
	    
	System.out.println("\nInforme a textetura do solo (1 - Argiloso; 2 - Textura média):");
	elementos.setTexturaSolo(teclado.nextInt());	   
	    
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
    }
}
