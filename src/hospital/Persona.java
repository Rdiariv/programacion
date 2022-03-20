package hospital;

public class Persona {

	String nombre;
	String apellidos;
	String direccion;
	String dni;
	int telefono;
	
	public Persona()
	{
		nombre="";
		apellidos="";
		direccion="";
		dni="";
		telefono=0;
	}
	
	public Persona(String nombre, String apellidos,
			String direccion, String dni, int telefono)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.dni=dni;
		this.telefono=telefono;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "\nNombre: "+nombre + " " + apellidos 
				+ "\nDireccion: " + direccion 
				+ "\nDNI: " + dni
				+ "\nTeléfono: " + telefono+"\n";
	}
	
	


}
