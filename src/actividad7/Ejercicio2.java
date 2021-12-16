/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 * Programa pide al usuario que introduzca dos número e imprime en pantalla
 * cual de ellos es mayor
 *
 */
public class Ejercicio2 {

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
		
		if(entrada[0]>entrada[1])//primer valor mayor
		{
			System.out.println(entrada[0]+ " es mayor que "+entrada[1]);
		}
		else if(entrada[0]<entrada[1])//segundo valor mayor
		{
			System.out.println(entrada[1]+" es mayor que "+entrada[0]);
		}
		else//valores iguales
		{
			System.out.println("Ambos valores son iguales.");
		}
		

	}

}
