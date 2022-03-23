package uml;

public class Cliente {
	
	private String nombre;
	private String dni;
	private int cp;
	
	
	//Constructor
	public Cliente()
	{
		this.nombre="";
		this.dni="";
		this.cp=0;
	}
	
	public Cliente(String nombre, String dni, int cp)
	{
		this.nombre=nombre;
		this.dni=dni;
		this.cp=cp;
	}

	
	
	
	//Métodos
	
	@Override
	public String toString() {
		return "Cliente: " + nombre + " con dni " + dni + " y código postal " 
				+ cp + "]";
	}
	
	public void setCp(int cp)
	{
		this.cp=cp;
	}
	
	
}
