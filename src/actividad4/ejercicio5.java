/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben 
 *
 */
public class ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro variables
		double radio, area;
		final double PI=3.1416;
		/*
		 * Creo el objeto sc de tipo scanner para la introducción de valores
		 * desde consola
		 */
		Scanner sc = new Scanner(System.in);
		
		//Solicito el valor del radio al usuario e inicializo la variable radio
		System.out.println("Introduzca valor para el radio.");
		radio=sc.nextDouble();
		
		//metodo close para cerrar la entrada de teclado
		sc.close();
		
		//declaro variable area con el calculo del area
		area=PI*radio*radio;
		
		//Imprimo en consola el valor del área
		System.out.println("El área del círculo es " + area + 
				" unidades cuadradas");
		
		//FIN
	}

}
