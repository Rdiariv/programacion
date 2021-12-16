/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide al usuario que introduzca una nota como un entero
 * devuelve el valor de la nota en formato texto
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean interruptor=false;
		int nota=0;
		Scanner sc = new Scanner(System.in);
		
		while(interruptor==false || nota>10 || nota<0)
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
		case 0 -> mensaje="cero";
		case 1 -> mensaje="uno";
		case 2 -> mensaje="dos";
		case 3 -> mensaje="tres";
		case 4 -> mensaje="cuatro";
		case 5 -> mensaje="cinco";
		case 6 -> mensaje="seis";
		case 7 -> mensaje="siete";
		case 8 -> mensaje="ocho";
		case 9 -> mensaje="nueve";
		case 10 -> mensaje="diez";
		default ->	System.out.println("Valor no reconocido");
		}
		
		System.out.println("Has sacado un "+mensaje);

	}

}
