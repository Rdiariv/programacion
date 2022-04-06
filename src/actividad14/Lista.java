package actividad14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

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
		/*Introduce los valores almacenados en el archivo CSV
		 */
		
			String archivoCSV="datos/entrada.csv" ;
			BufferedReader br=null;
			String linea="";
			String separador=",";
			String [] valores= new String [8];
			Persona p;
			
			try
			{
				//Creo objeto br donde cargo el archivo CSV
				br=new BufferedReader(new FileReader(archivoCSV));
				
				//mientras se pueda leer la línea en el archivo
				while((linea=br.readLine())!=null)
				{
					valores = linea.split(separador);
					
					/*
					 * Creo objeto persona con cada línea de datos obtenida 
					 * del archivo
					 */
					p=new Persona(valores[0], valores[1], 
							Integer.parseInt(valores[2]), 
							Integer.parseInt(valores[3]), 
							new Direccion(valores[4], 
							Integer.parseInt(valores[5]),
							Integer.parseInt(valores[6]),
							valores[7]));
			
					//Añado cada persona creada en la lista
					insertar(p);
				}
			}
			catch(Exception e)
			{
				System.out.println("No se ha podido leer el archivo.");
			}
		
		
	}
	
	public void listar()
	{
	
		System.out.println("\n----------------------------------------------");
		for(Persona p:this.listado)
		{
			System.out.println("\n"+p.toString());
		}
		System.out.println("----------------------------------------------");
	}
	
	public void insertar(String nombre, String apellidos, int dni, 
			Integer edad, String calle, Integer numero, Integer cp, String provincia)
	{
		
		//objeto de la clase dirección con los datos introducidos
		Direccion direc = new Direccion(calle, numero ,cp, provincia);
		
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

	
	/*
	 * método eliminar. elimina la entrada n-1, la que sería la entrada n para
	 * el usuario. 
	 */
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
	
	
	/*
	 * buscarDni, devuelve objeto persona que coincida con el dni introducido
	 * si no lo encuentra devuelve valor null
	 */
	
	public Persona buscarDni(int dni)
	{
		boolean bandera=false;
		System.out.println("Buscando persona con dni "+dni+".");
		for(Persona p:this.listado)
		{
			if(p.dni==dni)
			{
				bandera=true;
				System.out.println(p.toString());
				return p;
			}
		}
		
		if(bandera==false)
		{
			System.out.println("No se ha encontrado persona con dni "+dni+".");
		}
		
		return null;
	}
	
	/*
	 * Método buscarNombre, pide al usuario un nombre para buscar en la lista
	 * muestra en pantala los nombres de personas que haya encontrado y retorna
	 * un ArrayList con las coincidencias
	 */
	
	public ArrayList<Persona> buscarNombre(String nombre)
	{
		boolean bandera=false;
		//ArrayList donde guardaré las posiciones de las coincidencias
		ArrayList<Integer> n = new ArrayList<Integer>();
		//ArrayList donde guardaré las personas con ese nombre y que retorna
		//el método
		ArrayList<Persona> per=new ArrayList<Persona>();	
		int i=0; //para contar las posiciones
		
		for(Persona p:this.listado)//recorro la lista
		{
			if(p.nombre.equalsIgnoreCase(nombre))//si el nombre coincide
			{
				n.add(i);//añado la posicion al ArrayList de posiciones
				bandera=true;//establezco que existe coincidencia
			}
			i++;
		}
		
		if(bandera==true)//si existen coincidencias
		{
			System.out.println("---------------------------------------------");
			//Imprimo en pantalla el número de coincidencias
			System.out.println("\nSe han encontrado "+n.size()
					+ " personas con el nombre "+nombre+":\n");
			
			//recorro el vector de posiciones de coincidencia
			for(int ii:n)
			{
				//imprimo la persona con ese nombre
				System.out.println(this.listado.get(ii).toString()+"\n");
				//añado la persona con ese nombre al ArrayList
				per.add(this.listado.get(ii));
			}
			System.out.println("---------------------------------------------");
			
			return per;
		}
		else
		{
			System.out.println("No se han encontrado coincidencias.");
		}
	
		//Para probar
		/*
		for(Persona ii:per)
		{
			System.out.println(ii.toString()+"\n");
		}
		*/
		
		return null;
	}
	
	
	public void ordenar()
	{
		Collections.sort(this.listado, new OrdenaPorApellido());
	}
	
	
	
	/*
	 * método guardarCSV. guarda los valores de los objetos persona de la 
	 * lista en un archivo csv
	 */
	
	public void guardarCSV(String nombre)
	{
		try
		{
			//Creo el objeto del archivo
			BufferedWriter bw=new BufferedWriter(new FileWriter(nombre+".csv"));
			
			//Recorro el listado y voy guardandolo en el archivo 
			//separando los valores por comas
			for(Persona p:this.listado) 
			{
				bw.write(p.nombre+","+p.apellidos+","+p.dni+","+p.edad+","+
						p.direccion.calle+","+p.direccion.numero+","+
						p.direccion.cp+","+p.direccion.provincia+"\n");
			}
			//cierro objeto archivo	
			bw.close();
			//Informo al usuario
			JOptionPane.showMessageDialog(null, "Guardado como "+nombre+".csv"
					+" en src.");
		}
		catch(Exception e)
		{
			System.out.println("No se puede crear el archivo.");
		}
	}
	
}
