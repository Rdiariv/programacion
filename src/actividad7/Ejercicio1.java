/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide al usuario que introduzca un número e imprime en pantalla
 * si es par o impar
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero=0;
		boolean interruptor=false;
		
		/*
		 * El bucle se ejecuta mientras no se haya introducido un valor correcto
		 */
		while(interruptor==false)
		{
			System.out.println("Introduzca un número entero:");
			
			/*
			 * Comprueba que el valor de entrada sea un entero, si lo es
			 * asigna ese valor a la variable número
			 */
			if(sc.hasNextInt()==true)
			{
				numero=sc.nextInt();
				interruptor=true;
			}
			else
			{
				System.out.println("Entradad no válida.");
			}
			//Reinicio el objeto sc para poder usar nuevamente el hasNextInt
			sc = new Scanner(System.in);
		}
		sc.close();
		
		/*
		 * Si el numero dividido por dos tiene resto cero es par, si no 
		 * obtiene resto cero es impar	
		 */
		if(numero%2==0)
		{
			System.out.println("El número es par.");
		}
		else
		{
			System.out.println("El número es impar.");
		}
	}

}
