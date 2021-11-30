
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * El programa devuelve el valor del radio de una esfera a partir del valor
 * del diametro introducido por el usuario, en las mismas unidades
 * 
 * INPUT: valor del diametro
 * 
 * OUTPUT: valor del radio
 *
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaración de variables
		double radio, diametro;
		
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca diámetro.");
		
		// inicializo variable diametro con el valor que introduzca el usuario
		diametro=sc.nextDouble();
		
		//cierro objeto de clase Scanner
		sc.close();
		
		//Inicializo variable radio con la transformación
		radio=diametro/2;
		
		//Imprimo en consola el valor del radio
		System.out.println("El valor del radio de la esfera es "+ radio);
		
		

	}

}
