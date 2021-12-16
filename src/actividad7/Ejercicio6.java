/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide al usuario que introduzca una nota como un entero
 * devuelve el valor de la nota en formato texto
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables
		double numero=0;
		//Instancio clase scanner para capturar las entradas de teclado
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Mientras el numero sea mayor que cero pide nuevo numero e imprime
		 * su raiz
		 */
		while(numero>=0)
		{
			System.out.print("Introduzca un número:");
			numero=sc.nextDouble();
			
			
			System.out.println("La raíz de "+numero+" es "
					+ (Math.sqrt(numero)));
		}
		
		//cierro captura de consola
		sc.close();
	}

}
