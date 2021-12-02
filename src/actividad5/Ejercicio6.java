/**
 * 
 */
package actividad5;

import java.util.Scanner;

/**
 * @author ruben
 *	El programa pide dos valores al usuario, realiza la división e imprime
 *	en vantalla el cociente obtenido con dos decimales
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		float cociente;
		//Creo objeto para capturar las entradas de teclado
		Scanner sc=new Scanner(System.in);	
		
		//inicializo las variables con los datos que pido al usuario
		System.out.println("Introduzca el numerador.");
		num1=sc.nextFloat();
		System.out.println("Introduzca el denominador");
		num2=sc.nextFloat();
		
		//cierro la captura de teclado
		sc.close();
		
		//calculo el cociente estableciendo dos decimales e inicializo la
		//variable cociente con el resultado
		/*
		 * Manera alternativa a la dada en los apuntes para el redondeo a dos
		 * decimales.
		 */
		cociente=(float)(Math.round((num1/num2)*100d)/100d);
		
		//imprimo en pantalla el valor obtenido
		System.out.println("El cociente entre los números es "+cociente+
				" con redondeo a dos decimales.");
		
	}

}
