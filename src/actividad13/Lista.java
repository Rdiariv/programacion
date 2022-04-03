package actividad13;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
	//Atributos de clase
	
	private ArrayList<Persona> listado = new ArrayList<Persona>();

	//Constructor vacio, usamos métodos en la lista creada
	public Lista() 
	{
		
	}
	
	//métodos
	
	public void cargar()
	{
		/*
		 * Utilizo el método insertar para cargar en la lista las personas
		 * que nos da el ejercicio
		 */
		this.insertar("Adrián", "García Santos", "11111111A", 23, 
				"C\\ Los Olivos", 38493, "Santa Cruz de Tenerife");
		this.insertar("Ana", "Mendez Núñez", "22222222B", 25, 
				"C\\ Los Pinos", 38403, "Santa Cruz de Tenerife");
		this.insertar("María", "Sanchéz Camacho", "33333333C", 23, 
				"C\\ Los Franceses", 38505, "Las Palmas");
		this.insertar("Julio", "Brito González", "44444444D", 30, 
				"C\\ Los Pinos", 38403, "Las Palmas");
	}
	
	public void listar()
	{
	
		for(Persona p:this.listado)
		{
			System.out.println(p.toString()+"\n");
		}
	}
	
	public void insertar(String nombre, String apellidos, String dni, 
			Integer edad, String calle, Integer cp, String provincia)
	{
		
		//objeto de la clase dirección con los datos introducidos
		Direccion direc = new Direccion(calle, cp, provincia);
		
		/*
		 * objeto de la clase persona con los datos introducidos además 
		 * del objeto direc de la clase direccion creado con anterioridad
		 */
		Persona person=new Persona(nombre, apellidos, dni, edad, direc);
		
		//añado la persona creada al final de lista
		this.listado.add(person);

	}
	
	
	public void insertar(Persona p)
	{
		this.listado.add(p);
	}

	
	public void eliminar(int n)
	{
		try
		{
			this.listado.remove(n-1);
		}
		catch(Exception e1)
		{
			System.out.println("No se ha podido eliminar el elemento "+n+".");
		}
		
	}
	
	/*
	 * Método contar, retorna el número de personas en la lista como un entero
	 */
	public int contar()
	{
		return this.listado.size();
	}
	
	
	public void buscar(String dni)
	{
		boolean bandera=false;
		System.out.println("Buscando persona con dni "+dni+".");
		for(Persona p:this.listado)
		{
			if(p.dni.equalsIgnoreCase(dni))
			{
				bandera=true;
				System.out.println(p.toString());
			}
		}
		
		if(bandera==false)
		{
			System.out.println("No se ha encontrado persona con dni "+dni+".");
		}
	}
	
	
	public void ordenar()
	{
		Collections.sort(this.listado, new OrdenaPorApellido());
	}
	
}
