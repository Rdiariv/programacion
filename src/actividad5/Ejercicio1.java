/**
 * 
 */
package actividad5;

import java.util.Scanner;

/**
 * @author ruben
 *	Programa que calcula el IMC 
 *	INPUT: 
 *			peso en kilogramos 
 *			altura en metros
 * OUTPUT: 
 * 			IMC
 * 			Mensaje sobre el estado de forma
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		float imc, altura, peso;
		
		//Creo objeto de tipo Scanner para capturar las entradas de consola
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca su altura en metros.");
		altura=sc.nextFloat();
		System.out.println("Introduzca su peso.");
		peso=sc.nextFloat();
		
		//cierro objeto sc
		sc.close();
		
		//inicializo variable imc con el calculo del imc
		imc=(float)(peso/(Math.pow(altura, 2)));
		//imprimo en pantalla el valor del imc
		System.out.println("Su imc es de " + imc);
		
		//doy mensaje si el imc se considera saludable
		if(imc<=25 && imc>=18)
		{
			System.out.println("Es usted una persona saludable");
		}
		else
		{
			System.out.println("No tiene un imc considerado como saludable,"
					+ " consulte con su médico.");
		}
			
			
		
 
	}

}
