/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * El programa solicita el valor en euros y devuelve el valor en dolares
 *
 */
public class ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaración de variables
		double euros, dolares;
		
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
		Scanner sc = new Scanner(System.in);
		
		//Solicito valor en euros e inicializo la variable euros con la entrada
		System.out.println("Introduzca el valor en euros.");
		euros=sc.nextDouble();
		
		//metodo close para cerrar la entrada de teclado
		sc.close();
		
		//inicializo la variable dolares con la transformación de moneda
		dolares=euros*1.1757;
		
		//Imprimo en consola el valor de la misma cantidad de dinero en dolares
		System.out.println("Al cambio actual " + euros + " euros son " +
				dolares + " dólares");
		
	}

}
