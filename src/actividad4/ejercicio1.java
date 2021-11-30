/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide al usuario que introduzca una temperatura en grados
 * celsius y devuelve esa temperatura en grados Fahrenheit
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		double gradosC; //grados centigrados
		double gradosF;	//grados fahrenheit
		
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca grados centígrados.");
		
		/*
		 * Inicializo variable gradosC con la entrada del usuario
		 */
		gradosC=sc.nextDouble(); 
		
		sc.close(); //metodo close de la clase Scanner
		
		/*
		 * Inicializo la variable gradosF con el valor del cambio de unidad
		 */
		gradosF=gradosC*9/5+32;
		
		//Imprimo en pantalla el resultado
		System.out.println("La temperatura introducida son " + gradosF + 
				" grados Fahrenheit");

	}

}
