package actividad9;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MetodosEjercicios {
	
	//no pongo un constructor ni atriburtos de clase
	/*
	 * TODOS LOS MÉTODOS PEDIDOS EN LOS EJERCICIOS SE ENCUENTRAN EN ESTA
	 * CLASE
	 */
	
	
	//METODOS EJERCICIO 1
	/*
	 * imprime el mensaje en pantalla introducido como parámetro
	//imprimo el valor de la transformación	 */
	public static void imprimirMensaje(String mensaje)
	{
		System.out.println(mensaje);		
	}

	
	//METODOS EJERCICIO 2
	/*
	 *Suma numeros desde 1 hasta n, pasado como parámetro en el método 
	 *
	 *metodo que garantiza la entrada de un entero
	 */
	public static int sumarNumero(int n)
	{
		int suma=0;
		for(int i=1; i<=n; i++)
		{
			suma=suma+i;
		}
	
		return suma;
	}
	
	
	public static int verificaInt(String tipo)
	{
		int valor=0;
		boolean interruptor=true;
		
		do
		{
			System.out.print("Introduzca "+tipo+":");
			if(sc.hasNextDouble()==true)
			{
				valor=sc.nextInt();
				interruptor=false;
			}
			else
			{
				System.out.println("Valor introducido no válido.");
			}
			sc.nextLine();//limprio buffer
		
		}while(interruptor==true);
		
		return valor;
	}
	
	

	
	//METODOS EJERCICIO 3
	/*
	 *Imprime en pantalla los números pares de 1 a 20 
	 */
	public static void imprimirPares()
	{
		System.out.println("Los números pares del 1 al 20 son:");
		
		for(int i=2; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}
	}

	
	//METODOS EJERCICIO 4
	/*
	 * Metodo para imprimir impares
	 */
	
	//Imprimir impares
	public static void imprimirImpares()
	{
		System.out.println("Los números impares del 1 al 20 son:");
				
		for(int i=1; i<=20; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}
		}
	}
	
	

	
	//EJERCICIO 5
	/*
	 * programa que da la opción de transformar temperaturas entre
	 * grados Centigrados y Fahrenheit
	 * 
	 * Metodo para Fahrenheit a centigrados
	 * Método para centigrados a Farenheit
	 * Método que verifica si la entrada es un double
	 */

	//retorna la temperatura en Fahrenheit
	public static double ftoc(double temperatura)
	{
		return (temperatura-32)/1.8;
	}
	
	//retorna la temperatura en centigrados
	public static double ctof(double temperatura)
	{
		return (temperatura*1.8)+32;
	}
	
	//Pide un valor correcto para la temperatura y lo retorna
	public static double verifica(String tipoT)
	{
		double temperatura=0;
		boolean interruptor=true;
		
		do
		{
			System.out.print("Introduzca temperatura en "+tipoT+": ");
			
			//me aseguro que la entrada sea double
			if(sc.hasNextDouble()==true)
			{
				temperatura=sc.nextDouble();
				interruptor=false;
			}
			else
			{
				System.out.println("Valor introducido no válido.");
			}
			sc.nextLine();//limpio buffer
		
		}while(interruptor==true);
		
		return temperatura;
	}
	

	//EJERCICIO 6
	/*
	 * metodo que introduciendo como parámetro un valor entero verifica
	 * si ese año es bisiesto o no y lo imprime en pantalla
	 */
	public static void calcularAnyoBisiesto(int year)
	{
		GregorianCalendar calendar=new GregorianCalendar();
		
		if(calendar.isLeapYear(year))
		{
			System.out.println("El año "+year+" es bisiesto.");	
		}
		else
		{
			System.out.println("El año "+year+" no es bisiesto.");
		}
	}




	//CREO OBJETO SC A NIVEL DE CLASE
	private static final Scanner sc = new Scanner(System.in);
}
