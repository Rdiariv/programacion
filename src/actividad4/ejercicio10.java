/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * Al introducir un numero decimal el programa realiza un redondeo
 * en funcion del valor del primer decimal
 * 
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro variables
		float numero;
		int redondeo;
		
		//instancio un objeto de la clase Scanner en sc
		Scanner sc = new Scanner(System.in);
		
		//pido datos al usuario e inicializo la variable numero
		System.out.println("Introduzca número decimal");
		numero=sc.nextFloat();
		sc.close();//cierro las entradas desde consola
		
		//obtengo la parte entera del número introducido
		redondeo=(int)numero;
		System.out.println(redondeo);
		
		
		if(numero<0) //si el número es negativo
		{
			/*
			 * Si la parte decimal es menor o igual que -0.5,
			 * esto es, si el valor absoluto de los decimales es mayor 
			 * o igual que 0.5
			 */
			if(numero-redondeo<=(-0.5))
			{
				redondeo--; //incrementamos en 1 el valor absoluto del redondeo
			}
		}
		else  //Si el número introducido es 0 o positivo
		{
			/*
			 * si la parte decimal es mayor o igual que 0.5
			 */
			if(numero-redondeo>=0.5)
			{
				redondeo++; //incrementamos en 1 el valor absoluto del redondeo
			}
		}
		
		System.out.println("El valor redondeado es " + redondeo);
	}

}

