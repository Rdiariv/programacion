/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 *	El programa solicita 3 valores al usuario y calcula la media
 */
public class ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaración de variables
		double valor1, valor2, valor3, media;
				
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
		Scanner sc = new Scanner(System.in);
		
		//solicito datos al usuario
		System.out.println("Introduzca valor 1:");
		valor1=sc.nextDouble();
		System.out.println("Introduzca valor 2:");
		valor2=sc.nextDouble();
		System.out.println("Introduzca valor 3:");
		valor3=sc.nextDouble();
		//metodo close para cerrar la entrada de teclado
		sc.close();
		
		//Calculo la media
		media=(valor1+valor2+valor3)/3;
		
		//Imprimimo en pantalla el valor de la media de los 3 valores
		System.out.println("\nLa media de los 3 números es " + media);

	}

}
