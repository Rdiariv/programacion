/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean interruptor=false;
		int nota=0;
		Scanner sc = new Scanner(System.in);
		
		while(interruptor==false)
		{
			System.out.println("Introduzca nota numérica ");
			
			if(sc.hasNextInt()==true)//si la entrada es valida
			{
				/*
				 * Asigno valor introducido a nota
				 * interruptor para cancelar el bucle while
				 */
				nota=sc.nextInt();
				interruptor=true;
			}
			else
			{
				//Si no es entrada valida aviso al usuario
				System.out.println("Entrada no válida");
			}
		
			sc = new Scanner(System.in);
		}
		
		sc.close(); //cierro entrada de consola
		
		//creo variable mensaje
		String mensaje="";
		
		/*
		 * el switch asigna un mensaje a la variable mensaje para imprimir
		 * en pantalla en funcion de la nota numerica introducida
		 */
		switch(nota)
		{
		case 0,1,2,3,4 -> mensaje = "insuficiente, muy mal";
		case 5 -> mensaje="suficiente, que mala nota";
		case 6 -> mensaje="bien";
		case 7,8 ->	mensaje="notable";
		case 9,10 -> mensaje="sobresaliente";
		default ->	System.out.println("Valor no reconocido");
		}
		
		System.out.println("Has sacado "+mensaje);

	}

}
