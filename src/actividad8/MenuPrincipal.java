/**
 * 
 */
package actividad8;

import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class MenuPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables
		boolean interruptor=true; //controla el flujo del bucle while
		int sel=100;
		
		
		Scanner sc = new Scanner(System.in);
		
		//genero el array creando un objeto de la clase Vector
		Vector vector1 = new Vector();
		
		//MENU PRINCIPAL
		do
		{
			System.out.println("\nMenu principal:\n");
			System.out.println("1) Imprime el mayor valor del array.\n"
					+ "2) Imprime el menor valor del array.\n"
					+ "3) Calcula la media de todos los valores del array.\n"
					+ "4) Imprime el array.\n"
					+ "0) Salir.\n\n"
					);
			System.out.print("Opción: ");
			
			
			//PEDIR ENTRADA AL USUARIO
			sc = new Scanner(System.in);//reinicio el objeto sc
			
			if(sc.hasNextInt()) //si la entrada de consola es un entero
			{
				sel=sc.nextInt();//guardo la entrada en sel
			}
			else
			{
				sel=100; //doy valor a sel para que salte el default
			}
			
			
			
			//Opciones para cada entrada
			switch(sel)
			{
				case 1://imprime el valor máximo de las entradas del array
					System.out.println("\nEl valor máximo del array es "
							+vector1.vectormax()); 
				
				break;
				
				case 2://imprime el valor mínimo de las entradas del array
					System.out.println("\nEl valor mínimo del array es "
							+vector1.vectormin()); 
				break;
				
				
				case 3: //imprime la media de los valores del array
					System.out.println("\nLa media de los valores del array es "
							+vector1.media()); 
				break;
				
				
				case 4: //imprime los valores del vector en pantalla
					System.out.println("\nEl array introducido es:\n"
							+vector1.toString()); 
				break;
				
				case 0: //cierra el menu principal y el programa
					interruptor=false;
				break;
				
				default:
					System.out.println("Opción no válida\n\n");
			}
		
		}while(interruptor==true);
	
		//cierro el objeto sc
		sc.close();
		
		//mensaje de salida del programa
		System.out.println("Gracias por utilizar mi programa.");
	}
}


	
	



