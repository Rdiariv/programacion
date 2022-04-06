package actividad15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
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
			
		String [] valores;
			
		Persona p;
			
			
			
		try
		{
			//creo objeto reader con el archivo que quiero cargar
			Reader reader = Files.newBufferedReader(Paths.get(archivoCSV));
			
			//creo objeto CSVReader con el reader del archivo
			CSVReader csvReader = new CSVReader(reader);
				
				
			//mientras se pueda leer la línea en el archivo lo voy añadiendo
			//al array valores
			while((valores=csvReader.readNext())!=null)
			{
			
				
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
			
			csvReader.close();
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
		
		//genero un array para los datos
		String[] datos = new String[8];
		
		try {
			// Inicializar CSVWriter con el nombre de archivo
			CSVWriter archivo = new CSVWriter(new FileWriter(nombre+".csv"));

			for (Persona p : this.listado) 
			{

				datos[0] = p.nombre;
				datos[1] = p.apellidos;
				datos[2] = String.valueOf(p.dni);
				datos[3] = String.valueOf(p.edad);
				datos[4] = p.direccion.calle;
				datos[5] = String.valueOf(p.direccion.numero);
				datos[6] = String.valueOf(p.direccion.cp);
				datos[7] = p.direccion.provincia;
				
				//añado en una línea los datos del array separados por comas
				//el parámetro true hace que no sobreescriba las líneas
				archivo.writeNext(datos,true);
			}
			
			//cierro el archivo
			archivo.close();
			
			//Informo al usuario de que se han escrito los datos
			JOptionPane.showMessageDialog(null, "Se han escritos los datos en "
					+nombre+".csv");
		} 
		catch (IOException e) 
		{
			System.out.println("No se puede crear el archivo.");
		}
	
	}
	
	public void guardaPdf(String nombre)
	{
		try
		{
			//creo el documento
			Document documento = new Document();
			//genero el archivo pdf
			FileOutputStream ficheroPdf = new FileOutputStream(nombre+".pdf");
			//Asocio documento y archivo
			PdfWriter.getInstance(documento,ficheroPdf);
			
			//arbro el documento
			documento.open();
			
			//Añado imagen al pdf
			Image foto = Image.getInstance("Spok.jpg");
			foto.scaleToFit(150, 150);
			foto.setAlignment(Chunk.ALIGN_MIDDLE);
			documento.add(foto);
			
			
			//linea de separación
			documento.add(new Paragraph("                       "));
			
			//encabezado del listado
			documento.add(new Paragraph("Relación de pasajeros de "
					+ "la USS Enterprise:"));
			//linea de separacion
			documento.add(new Paragraph("                       "));
			
			//creo el objeto tabla con 4 columnas
			PdfPTable tabla = new PdfPTable(4);
			
			for(Persona p:this.listado)
			{
				//añado los valores de las personas a las celdas de la tabla
				tabla.addCell(p.nombre);
				tabla.addCell(p.apellidos);
				tabla.addCell(String.valueOf(p.dni));
				tabla.addCell(String.valueOf(p.edad));
				tabla.addCell(p.direccion.calle);
				tabla.addCell(String.valueOf(p.direccion.numero));
				tabla.addCell(String.valueOf(p.direccion.cp));
				tabla.addCell(String.valueOf(p.direccion.provincia));
				
				//añado la tabla al documento
				documento.add(tabla);
				
				//espacio de separación entre personas
				documento.add(new Paragraph("                       "));
				
				//borro la tabla
				tabla.deleteBodyRows();
			}
			
			JOptionPane.showMessageDialog(null, "Se ha generado el archivo "
					+nombre+".pdf");
			
			//cierro el documento
			documento.close();
			 
		}
		catch(Exception e)
		{
			System.out.println("No se ha podido crear el archivo.");
		}
	}
	
}
