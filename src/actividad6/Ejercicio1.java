/**
 * 
 */
package actividad6;

import java.util.Scanner;

/**
 * @author ruben
 * El programa genera un número aleatorio entre 1 y 100, ambos incluidos.
 * Pide al usuario que introduzca números hasta que acierta el número secreto
 * Al acertarlo imprime un mensaje en pantalla
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Genero un número aleatorio tal que 1<=numero<=100
		short numero=(short)(Math.random()*100+1);
		
		//declaro variables
		short entrada=0; //entradas del jugador
		int intentos=0; //numero de intentos, tipo int porque todo es posible
		
		//instancio objeto de la clase Scanner para entradas de consola
		Scanner sc=new Scanner(System.in);
		
		//inicio bucle que se repite hasta que acierte el número
		while(entrada!=numero)
		{
			/*
			 * Solicito al jugador un número con el que inicializo la variable
			 * entrada
			 */
			System.out.print("Intengo número " + (intentos+1) +
					". Introduzca un número: ");
			
			//Decide si el valor introducido es un short
			if(sc.hasNextShort()==true)//si es short 
			{
				/*
				 * Inicializo la variable entrada con el short introducido
				 * y sumo un intento
				 */
				entrada=sc.nextShort();
				intentos++;
				
				//Mensajes que imprime en pantalla en funcion del valor de entrada
				
				if(entrada>numero) //si el valor introducido es mayor
				{
					System.out.println("El número generado es nenor que "+entrada);
				}
				else if(entrada<numero) //si el valor introducido es menor
				{
					System.out.println("El número generado es mayor que "+entrada);
					
				}
				else //si el valor introducido es igual
				{
					System.out.println("\nEnhorabuena, has acertado el número secreto.");
				}
			}
			else //Si el valor introducido no es un short
			{
				//En este caso no cuenta como intento
				System.out.println("VALOR INTRODUCIDO NO PERMITIDO.");
			}
			
			//reinicio el objeto sc para el hasNextShort
			sc = new Scanner(System.in);
		}
		
		//Cierro entradas de consola porque ya ha acertado el valor
		sc.close();
		
		//imprimo en pantalla el número de intentos
		System.out.println("El número de intentos para adivinar el número "
				+ "secreto ha sido de "+intentos);
	}

}
