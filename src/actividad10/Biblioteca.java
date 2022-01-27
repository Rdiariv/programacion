/**
 * 
 */
package actividad10;

import java.util.Scanner;

/**
 * @author ruben
 *el programa crea dos objetos libro y realiza diferentes prestamos
 *y devoluciones
 *
 */
public class Biblioteca{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sel=100;
	boolean interruptor=true;

	
	/*
	 * Creo los dos libros pedidos en la actividad utilizando el método
	 * con parámetros
	 * Queria probar a hacer un array de objetos
	 */
	Libro[] biblio = new Libro[10]; //array de objetos Libro
		
	biblio[0]= new Libro("El Quijote de La Mancha", 
				"Miguel de Cervantes", 2, 0);
	biblio[1] = new Libro("El Capitán Alatriste", 
				"Arturo Pérez Reverte", 1, 0);
		

	
	do
	{
		//imprimo menú interactivo para la biblioteca
		
		System.out.println("\nGestor de prestamos:"
				+"\nPRESTAMOS:"
				+"\n\t1)Prestar libro 1."
				+"\n\t2)Prestar libro 2."
				+"\nDEVOLUCIONES:"
				+"\n\t3)Devolver libro 1."
				+"\n\t4)Devolver libro 2."
				+"\nCONSULTA:"
				+"\n\t5)Consulta libro 1. (método toString superclase Object)"
				+"\n\t6)Consulta libro 2. (método toString superclase Object)"
				+"\n\t7)Consulta todo."
				+"\n\n0)SALIR");
		
		System.out.print("Opción: ");
		
		//me aseguro que la entrada del usuario sea un entero
		if(sc.hasNextInt())
		{
			sel=sc.nextInt(); //si es entero lo almaceno en sel
		}
		else
		{
			/*
			 * si no es entero damos un valor a sel que avise al usuario
			 * de que la entrada no es válida
			 *///Heredo de la subclase libro
			sel=100;
			sc.nextLine();
		}
		
		
		switch(sel)
		{
			case 1:
				biblio[0].prestamo();
				biblio[0].imprime();
			break;
			case 2:
				biblio[1].prestamo();
				biblio[1].imprime();
			break;
			
			case 3:
				biblio[0].devolucion();
				biblio[0].imprime();
			break;
			case 4:
				biblio[1].devolucion();
				biblio[1].imprime();
			break;
			
			case 5:
				System.out.println(biblio[0].toString());
			break;
			case 6:
				System.out.println(biblio[1].toString());
			break;
			
			case 7 :
				imprimidor(biblio);
			break;
			
			case 0:
				interruptor=false;
			break;
			
			default:
				System.out.println("Entrada no válida");
			break;
		}
	
	}while(interruptor==true);
	
	System.out.println("Gracias por utilizar el gestor de prestamos");
	
	}

	
	/*
	 * método imprimidor
	 * 
	 * recorre el array de objetos hasta que no haya objeto en la posicion
	 * e imprime mediante el método imprime de la clase Libro todos los datos
	 * de ese objeto libro
	 */
	private static void imprimidor(Libro array[])
	{
		System.out.println("********************************************");
		System.out.println("Libros registrados en la biblioteca:");
		System.out.println("------------------------------------------");
		int i=0;
		do
		{
			array[i].imprime(); //metodo imprime en pantalla los datos
			i++;
			System.out.println("------------------------------------------");
		}while(array[i]!=null);
	}

	// inicio objeto sc a nivel de clase para no tener que cerrarlo
	private static final Scanner sc = new Scanner(System.in);
	
	
}
