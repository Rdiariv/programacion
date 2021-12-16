/**
 * 
 */
package actividad7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ruben
 *El programa solicita al usuario que introduzca dos número y realiza la
 *division si es posible
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double entrada[]=new double[2]; //creo vector para las entradas 
		boolean interruptor=false;	//variable que controla el bucle while
		
		//creo objeto clase Scanner para las entradas en consola
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++)//para pedir las dos entradas
		{
			while(interruptor==false)
			{
				System.out.println("Introduzca valor "+(i+1)+":");
				
				if(sc.hasNextDouble()==true)//si la entrada es valida
				{
					/*
					 * Asigno el valor para la entrada (i+1) y activo el 
					 * interruptor para cancelar el bucle while
					 */
					entrada[i]=sc.nextDouble();
					interruptor=true;
				}
				else
				{
					//Si no es entrada valida aviso al usuario
					System.out.println("Entrada no válida");
				}
			
				sc = new Scanner(System.in);
			}
			
			interruptor=false; //apago el interruptor para el siguiente bucle
		
		} //fin del bucle for
		
		sc.close();//cierro objeto sc
		
		//aproximacion para cuatro decimales
		DecimalFormat decimales = new DecimalFormat();
		decimales.setMaximumFractionDigits(4);
		
		if(entrada[1]==0)//si el denominador es cero
		{
			System.out.println("No puede dividirse por cero");
		}
		else //en caso de no ser cero podemos hacer la division
		{
			System.out.println(entrada[0]+" dividido entre "+entrada[1]+" es "
					+decimales.format(entrada[0]/entrada[1])+". Aproximación "+
					"para cuatro decimales.");
		}

	}

}
