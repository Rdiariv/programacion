/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * INPUT:
 * Temperatura en grados Fahrenheit introducida por el usuario
 * 
 * OUTPUT:
 * Temperatura en grados celsius
 * 
 * El programa pide al usuario por consola que introduzca un valor
 * de temperatura en grados Fahrenheit y devuelve la temperatura introducida en
 * grados celsius
 */
public class ejercicio2 {

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
				
				System.out.println("Introduzca temperatura en Fahrenheit.");
				
				/*
				 * Inicializo variable gradosF con la entrada del usuario
				 */
				gradosF=sc.nextDouble(); 
				
				sc.close(); //metodo close de la clase Scanner
				
				/*
				 * Inicializo la variable gradosC con el valor del cambio de unidad
				 */
				gradosC=(gradosF-32)*5/9;
				
				//Imprimo en pantalla el resultado
				System.out.println("La temperatura introducida son " + gradosC + 
						" grados Celsius");

	}

}
