/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * El programa solicita al usuario su peso y altura y con estos valores calcula
 * el IMC.
 * Imprime en pantalla el valor del IMC y añade un comentario 
 */
public class ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACION DE VARIABLES
		double peso, altura, imc;
		
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
		Scanner sc = new Scanner(System.in);
		
		// solicito datos al usuario
		System.out.println("Introduzca su peso (en kilos).");
		peso=sc.nextDouble(); //inicializo variable peso con valor introducido
			
		System.out.println("Introduzca su altura (en metros).");
		altura=sc.nextDouble(); //inicializo variable altura
		//fin de solicitar datos
			
		//metodo close para cerrar la entrada de teclado
		sc.close();
		
		//inicializo variable imc con el calculo del IMC
		imc=peso/(altura*altura); 
		/*
		 * El IMC se calcula mediante el cociente del peso, en kilos, y el
		 * cuadrado de la altura, en metros.
		 */
		
		System.out.println("Su IMC es de " + imc);
		
		/*
		 * añade comentarios en función del valor del IMC
		 * este debe estar entre 18 y 25
		 */
		if(imc<=25 && imc>=18)
		{
			System.out.println("Esta estupendo.");
		}
		else if(imc>25)
		{
			System.out.println("Esta pasado, las tapitas del bar ¿eh?");
		}
		else
		{
			System.out.println("Su IMC es algo bajo");
		}
				

	}

}
