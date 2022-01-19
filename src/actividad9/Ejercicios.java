/**
 * 
 */
package actividad9;

import java.util.Scanner;

/**
 * @author ruben
 * Clase con el método main para todos los ejercicios, muestra un menú
 * en el que se elige el ejercicio de la actividad 9
 * 
 * Todos los métodos pedidos estan en la clase MetodosEjercicios
 * 
 * Los ejercicios que requieren un menú propio tienen el menú como un método
 * en esta misma clase
 *
 */
public class Ejercicios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel=100;
		boolean interruptor=true;
		
		//para el ejercicio 1
		String mensaje;
		
		//para ejercicio 2 y 6
		int numero;
		
		//para ejercicio 5
		double temperatura;
		
		
		
		//MENU PRINCIPAL
		do
		{
			//Imprimo el menu
			System.out.println("\nEjercicios:"
					+"\n1) Ejercicio 1.\n"
					+ "2) Ejercicio 2.\n"
					+ "3) Ejercicio 3.\n"
					+ "4) Ejercicio 4\n"
					+ "5) Ejercicio 5\n"
					+ "6) Ejercicio 6\n"
					+ "0) Salir");
			System.out.print("\nOpción:");
			
			//guardo la entrada de consola si es un entero
			if(sc.hasNextInt()==true)
			{
				sel=sc.nextInt();
			}
			else //si no es entero doy valor default para el switch
			{
				sel=100;
			}
			
			sc.nextLine();//limpio el buffer de sc
			
			switch(sel)
			{
				//EJERCICIO 1
				/*
				 * imprime en la pantalla un mensaje introducido por el usuario
				 */
				case 1:
					//pido al usuario que introduzca mensaje y lo cuardo en mensaje
					System.out.println("Introduzca texto");
					
					/*
					 * Limpio el buffer de sc e inicializo la variable
					 * mensaje con el mensaje introducido por el usuario
					 */
					mensaje=sc.nextLine();
					
					/*
					 * Imprimo el mensaje utilizando el método imprimirMensaje
					 * de la clase MetodosEjercicios
					 */
					System.out.println("El mensaje introducido es: ");
					MetodosEjercicios.imprimirMensaje(mensaje);
				break;
				
				
				
				//EJERCICIO 2
				/*
				 * Suma los números del 1 a n, siendo n un entero introducido
				 * por el usuario
				 */
				case 2:
					
					/*
					 * Metodo verificaInt(). Pido al usuario un entero
					 */
					numero=MetodosEjercicios.verificaInt("entero");
					
					/*
					 * imprimo la suma de los número usando el método
					 * sumarNumero para obtener el valor
					 */
					System.out.println("La suma de 1 a "+numero+" es "
							+MetodosEjercicios.sumarNumero(numero));
				break;
				
				
				
				//EJERCICIO 3
				/*
				 * Imprime números pares del 1 al 20
				 */
				case 3:
					MetodosEjercicios.imprimirPares();
				break;
				
				
				//EJERCICIO 4
				/*
				 * Un menú permite al usuario elegir si imprime los números
				 * pares o impares en el rango [1,20].
				 */
				case 4:
					/*
					 * El ejercicio tiene un menú propio, lo implemento 
					 * un método en esta misma clase
					 */
					menuPI();
				break;
				
				
				//EJERCICIO 5
				/*
				 * Programa conversor de temperaturas, tiene su propio menú.
				 */
				case 5:
					//El menú se encuentra como método en esta clase
					menuTemperatura();
				break;
				
				
				//EJERCICIO 6
				/*
				 * El programa pide al usuario que introduzca como valor entero
				 * un año. Utilizo el método verificaInt para que solo pueda
				 * introducir un entero
				 * 
				 * Imprime en pantalla si es bisiesto o no ese año
				 */
				case 6:
					numero=MetodosEjercicios.verificaInt("año");
					
					MetodosEjercicios.calcularAnyoBisiesto(numero);
					
				break;
				
				
				//SALIR
				case 0:
					interruptor=false;
				break;
				
				
				//MENSAJE PARA VALOR NO PERMITIDO EN EL MENÚ
				default:
					System.out.println("Entrada no válida");
				break;
					
			}
		}while(interruptor==true);
	
		System.out.println("Gracias por utilizar mi programa.");
	}
	
	
	
	//METODOS (son los menús de los ejercicios que lo requieren)
	
	//MENU PARA EL EJERCICIO 4
	private static void menuPI()
	{
		int sel;
		boolean interruptor=true;
		
		do
		{
			//menu para pares o impares
			System.out.println("\n1)Imprimir impares.\n"
					+"2)Imprimir pares\n"
					+"0)Salir.");
			System.out.print("Opcion:");
				
				
			if(sc.hasNextInt()==true)
			{
				sel=sc.nextInt();
			}
			else
			{
				sel=100;
			}
			
			//limpio el buffer
			sc.nextLine();
				
			switch(sel)
			{
				case 1: //imprimo impares
					MetodosEjercicios.imprimirImpares();
				break;
					
				case 2: //imprimo pares
					MetodosEjercicios.imprimirPares();
				break;
					
				case 0: //salir
					interruptor=false;
				break;
					
				default: //entrada no permitida
					System.out.println("Opción no válida.");
				break;
			}
			
		}while(interruptor==true);
			
	}
		
		
	//MENU PARA EL EJERCICIO 5
	private static void menuTemperatura()
	{
		double temperatura;
		int sel;
		boolean interruptor=true;
		
		do
		{
			//imprimo menu
			System.out.println("\n\nConversor de temperaturas:");
			System.out.println("1)Centígrados a Fahrenheit.\n"
					+"2)Fahrenheit a Centígrados.\n"
					+"0)Salir.\n");
			System.out.println("Opción: ");
				
			//me aseguro que la entrada sea entero
			if(sc.hasNextInt()==true)
			{
				sel=sc.nextInt();
			}
			else
			{
				sel=100;
			}
				
			sc.nextLine();// limpio el buffer
				
			//para casa caso
			switch(sel)
			{
				case 1:
					//pido el valor de temperatura al usuario
					temperatura=MetodosEjercicios.verifica("Centígrados");
					//imprimo el valor de la transformación
					System.out.println(temperatura+" grados Centrígrados"
					//Centígrados a Fahrenheit
							+" son "+MetodosEjercicios.ctof(temperatura)
							+" grados Fahrenheit.");
				break;
					
				
				case 2:
					//pido el valor de temperatura al usuario
					temperatura=MetodosEjercicios.verifica("Fahrenheit");
					//imprimo el valor de la transformación
					System.out.println(temperatura+" grados Fahrenheit"
							//Fahrenheit a Centígrados
							+" son "+MetodosEjercicios.ftoc(temperatura)
							+" grados Centígrados.");
				break;
						
				
				case 0:
					interruptor=false;
				break;
					
				
				default:
					System.out.println("Entrada no válida.");
				break;
				}
				
					
		}while(interruptor==true);
			
	}
	
	
	//CREO OBJETO SC A NIVEL DE CLASE
	private static final Scanner sc = new Scanner(System.in);

}
