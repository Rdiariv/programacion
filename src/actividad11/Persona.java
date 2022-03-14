package actividad11;

public class Persona {
	
	//atributos de clase
	protected String nombre;
	protected String direccion;
	protected int edad;
		
		
	//CONSTRUCTORES
		
	//Constructor vacio
	public Persona() 
	{
		this.nombre="";
		this.direccion="";
		this.edad=0;
	}
	
	//Constructor con argumentos
	public Persona(String nombre, String direccion, int edad)
	{
		this.nombre=nombre;
		this.direccion=direccion;
		this.edad=edad;
	}

	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	/*
	 * Método devuelve true si la edad es mayor o igual a 18 años y 
	 * false en caso contrario
	 */
	public boolean mayorEdad()
	{
		boolean mayor=false;
		
		/*
		 * Si es mayor de edad hacemos verdadero.
		 */
		if(this.edad>=18)
		{
			mayor=true;
		}
		
		return mayor;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nDireccion: " + direccion + "\nEdad: " 
				+ edad + " años.";
	}
	

	
	

}
