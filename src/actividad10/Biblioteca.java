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
	
	Estanteria biblio = new Estanteria();

	do
	{
		//imprimo menú interactivo para la biblioteca
		
			System.out.println("\nGestor de prestamos:"
					+"\n\t1)Mostrar lista de libros."
					+"\n\t2)Mostrar lista simplificada"
					+"\n\t3)Prestar libro."
					+"\n\t4)Devolver libro"
					+"\n\t5)Consultar libro. (método toString superclase Object)"
					+"\n\t6)Consultar libro."
					+"\n\t7)Añadir libro a la biblioteca."
					+"\n\t0)SALIR");
			
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
			//PEDIDO POR LA ACTIVIDAD
			case 1://muestra lista de libros
				imprimidor(biblio.array);
			break;
			
			case 2: //muestra lista simple de libros
				listaSimple(biblio.array, biblio.buscaHueco());
			break;
			
			case 3: 
				/*
				 * Muestra lista simplificada y pide al usuario
				 * que seleccione un libro
				 * tras selecionarlo intenta realizar el prestamo
				 */
				System.out.println("Prestar libro:");
				listaSimple(biblio.array, biblio.buscaHueco());
				biblio.array[selecBook()].prestamo();
			break;
			
			case 4:
				/*
				 * Devolver libro
				 */
				System.out.println("Devolver libro:");
				listaSimple(biblio.array, biblio.buscaHueco());
				biblio.array[selecBook()].devolucion();
			break;
			
			case 5:
				/*
				 * Consulta libro con el metodo toString de superclase object
				 */
				listaSimple(biblio.array, biblio.buscaHueco());
				System.out.println(biblio.array[selecBook()].toString());
			break;
			
			case 6:
				listaSimple(biblio.array, biblio.buscaHueco());
				biblio.array[selecBook()].imprime();
				
				
			break;
			
			case 7:
				/*
				 * añade libro a la biblioteca
				 * utilizo el método addbook de la clase estanteria
				 * utilizando por parametro el método buscaHueco de la misma
				 * clase
				 */
				biblio.addbook(biblio.buscaHueco());
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
	
	private static void listaSimple(Libro array[], int n)
	{
		
		System.out.println("-----Lista de libros-----");
		
		for(int i=0; i<n; i++)
		{
			System.out.println((i+1)+") Titulo: "+array[i].titulo+"\t| "
					+"Prestados/Disponibles: "+array[i].getNumeroEP()+"/"
					+array[i].getNumeroE());
		}
		
	}
	
	private static int selecBook()
	{
		int seleccion;
		//me aseguro que la entrada sea un entero
		do
		{
			
			System.out.print("Seleccione libro:");
			sc.nextLine();
		}while(sc.hasNextInt()==false);
		
		seleccion=sc.nextInt();
		
		return seleccion-1;
	}
	
	

	// inicio objeto sc a nivel de clase para no tener que cerrarlo
	private static final Scanner sc = new Scanner(System.in);
	
	
}
