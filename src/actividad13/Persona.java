package actividad13;

public class Persona {

	//ATRIBUTROS
	String nombre;
	String apellidos;
	String dni;
	Integer edad;
	Direccion direccion;
	
	//CONSTRUCTORES
	
	public Persona()
	{
		this.nombre="";
		this.apellidos="";
		this.dni = "";
		this.edad = 0;
		this.direccion = new Direccion("", 0, "");
	}
	
	
	public Persona(String nombre, String apellidos, String dni, Integer edad, 
			Direccion direccion) 
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.direccion = direccion;
	}


	//METODOS
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return nombre + " "+apellidos + "\nCon dni " + dni + " y edad " + edad
				+ " años.\n" + direccion.toString();
	}
	
	
	
}
