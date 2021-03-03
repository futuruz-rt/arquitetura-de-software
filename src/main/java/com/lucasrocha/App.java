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
		
	System.out.println("\nQuantidade de fósforo (mg.dm3 | mehlich): ");
	elementos.getElementosAtuais().setFosforo(teclado.nextDouble());
       
	System.out.println("\nQuantidade de potássio (cmol): ");
	elementos.getElementosAtuais().setPotassio(teclado.nextDouble());
       
	System.out.println("\nQuantidade de cálcio (cmol): ");
	elementos.getElementosAtuais().setCalcio(teclado.nextDouble());
       
	System.out.println("\nQuantidade de magnésio (cmol): ");
	elementos.getElementosAtuais().setMagnesio(teclado.nextDouble());
       
	System.out.println("\nQuantidade de Enxofre (mg.dm³): ");
	elementos.getElementosAtuais().setEnxofre(teclado.nextDouble());
       
	System.out.println("\nQuantidade de aluminio: ");
	elementos.getElementosAtuais().setAluminio(teclado.nextDouble());
		
	System.out.println("\nQuantidade de H+AL: ");
	elementos.getElementosAtuais().sethAl(teclado.nextDouble());	    

    }
}
