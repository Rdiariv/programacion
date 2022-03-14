package actividad12;

public class Persona {
	protected String nombre;
	protected int anioNacimiento;
	
	
	//CONSTRUCTORES
	public Persona()
	{
		this.nombre="";
		this.anioNacimiento=0;
	}
	
	public Persona(String nombre, int anioNacimiento)
	{
		this.nombre=nombre;
		this.anioNacimiento=anioNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nAño de nacimiento: " + anioNacimiento;
	}
	
	
	/*
	 * Método calcula descuento, se le pasa como parámetro un valor al que
	 * aplica un descuento si procede
	 */
	public double calculaDescuento(double precio)
	{
		System.out.println("Ha comprado artículos por valor de "+precio);
		return precio;
	}
	

}
