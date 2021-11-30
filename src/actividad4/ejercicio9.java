/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 *	El programa devuelve la parte decimal de un número real que introduce el
 *	usuario
 */
public class ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables siendo numero el valor introducido por el usuario
		// y dNumero la parte decimal del mismo
		double numero;//, dNumero;
		int eNumero; //para la parte entera
		float dNumero;
		// creo objeto sc para las entradas por consola
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Pido al usuario el valor del número real e inicializo la variable 
		 */
		System.out.println("Introduzca un número real");
		numero=sc.nextDouble();
		sc.close();//cierro el objeto sc
				
		//Obtengo la parte entera convirtiendo double a int
		eNumero=(int)numero;
		//Obtengo parte decimal restando la parte entera al número introducido y
		//Lo guardo en un float
		dNumero=(float)(numero-eNumero);
		
		//hago positivo los decimales si el valor introducido es negativo
		if(numero<0)  
		{
			dNumero=dNumero*(-1.0F);
		}
		
		//Imprimo los datos en pantalla
		System.out.println("La parte decimal del número " + numero + 
				" es " + dNumero);
	}

}
