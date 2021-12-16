/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables
		int numero=1;
		boolean interruptor=false;
		
		//creo objeto clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//bucle para pedir entrada al usuario
		while(interruptor==false || numero!=0)
		{
			System.out.print("\nIntroduzca un número:");
			
			if(sc.hasNextInt()==true)//si la entrada es valida
			{
				/*
				 * Asigno valor introducido a numero
				 * interruptor para cancelar el bucle while
				 */
				numero=sc.nextInt();
				interruptor=true;
				
				if(numero%2==0 && numero!=0)//si es par y no es cero
				{
					System.out.println("El número es par");
				}
				else if(numero!=0)//si no es par y no es cero
				{
					System.out.println("El número es impar.");
				}
				//Fin de si la entrada es válida
			}
			else
			{
				//Si no es entrada valida aviso al usuario
				System.out.println("Entrada no válida.");
			}
		
			//reinicio objeto clase Scanner
			sc = new Scanner(System.in);
			
		}
		
		sc.close();//cierro entradas de consola
		
		//Imprimo mensaje en pantalla al cerrar el programa
		System.out.println("Gracias por usar este programa.");
	}

}
