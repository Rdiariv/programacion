/**
 * 
 */
package actividad5;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide 2 números al usuario e imprime el menor de ellos 
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2;
		
		//creo objeto de la clase Scanner para capturar los datos introducidos
		Scanner sc=new Scanner(System.in);
		
		//Pido datos al usuario
		System.out.println("Introduzca el primer número:");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número:");
		num2=sc.nextFloat();
		
		//Cierro el objeto de clase scanner
		sc.close();
		
		//imprimo en pantalla el número menor utilizando el método min de la
		//clase Math
		System.out.println("El numero menor es "+
		Math.min(num1, num2)+".");

	}

}
