package actividad10;

import java.util.Scanner;

public class Estanteria {
	
	Libro array[]= new Libro[100];
	
	//constructor vacio
	public Estanteria() 
	{
		//creo los dos libros iniciales que pedia el ejercicio
		array[0]=new Libro("El Quijote de La Mancha", 
				"Miguel de Cervantes", 2, 0);
		array[1]=new Libro("El Capitán Alatriste", 
				"Arturo Pérez Reverte", 1, 0);
		
	}
	
	
	//metodos
	
	
	//busca hueco vacio en el array
	public int buscaHueco()
	{
		//busco hueco en array
				int i=0;
				while(this.array[i]!=null)
				{
					i++;
				}
				
		return i;
	}
	
	
	
	//añadir nuevo libro
	public void addbook(int i)
	{
		//variables para atributos de clase
		String titulo="a";
		String autor="a";
		int numeroE=0;
		int contador=0;
		
		//Pido datos al usuario y los almaceno en variables locales
		System.out.println("Añadir libro:");
		System.out.println("----------------------------");
		
		
		System.out.println("Título: ");
		if(sc.hasNextLine())
		{
			titulo=sc.nextLine();
			contador++;
		}
		
		System.out.println("Autor: ");
		if(sc.hasNextLine())
		{
			autor=sc.nextLine();
			contador++;
		}
		
		System.out.println("Ejemplares: ");
		if(sc.hasNextInt())
		{
			numeroE=sc.nextInt();
			contador++;
		}
		
		
		
		
		if(contador==3)
		{
			//instancio el nuevo libro en el array
			//si y solo si las 3 entradas son aceptables
			this.array[i]=new Libro(titulo, autor, numeroE, 0);
			
			//imprimo en pantalla mensaje 
			System.out.println("Libro añadido correctamente");
			System.out.println(array[i].titulo + " | " 
					+ array[i].autor + " | "
					+array[i].numeroE);
		}
		else //si las entradas no son aceptables aviso al usuario
		{
			System.out.println("Entradas no válidas. "
					+ "No se ha añadido el libro.");
			
		}
		
		/*
		 * Limpio el buffer de la clase Scanner para este método
		 * no entiendo por que es necesario, sin esto, al utilizar dos veces
		 * seguidas addbook no funciona correctamente y pienso que no deberia
		 * ser así porque al terminar el método deberia limpiarse el buffer de
		 * Scanner para esta clase.
		 * ¿podria ser porque el método no es estatico sino que al ser 
		 * necesario el objeto no cierra el sc al terminar con el mismo?
		 */
		sc.nextLine();
		
	}


	// inicio objeto sc a nivel de clase para no tener que cerrarlo
		private static final Scanner sc = new Scanner(System.in);
		

}
