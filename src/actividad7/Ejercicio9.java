/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide un entero al usuario e imprime en pantalla la tabla de
 * multiplicar de ese numero
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro variables
		int numero;
		boolean interruptor=false;
		
		//Creo objeto sc para las entradas del usuario
		Scanner sc = new Scanner(System.in);
		
		//bucle para pedir entrada al usuario
				while(interruptor==false)
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
						
						//imprimo mensaje en pantalla
						System.out.println("La tabla del "+numero+":");
						
						//imprimo la tabla de "numero" en pantalla
						for(int i=0; i<=10; i++)
						{
							System.out.println("\t"+numero+"x"+i+"="+(numero*i));
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
			sc.close();

	}

}
