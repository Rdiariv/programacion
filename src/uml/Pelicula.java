package uml;

public class Pelicula extends Producto {

	String tituloP;
	double duracion;
	String genero;
	private boolean bodrio;
	
	//Constructor
	public Pelicula()
	{
		super();
		this.tituloP="";
		this.duracion=0;
		this.genero="";
		this.bodrio=true;
	}
	
	public Pelicula(String nombre, String dni, int cp, float peso
			, float volumen, float precio, boolean envioCanarias, String tituloP
			, double duracion, String genero, boolean bodrio)
	{
		super(nombre, dni, cp, peso, volumen, precio, envioCanarias);
		
		this.tituloP=tituloP;
		this.duracion=duracion;
		this.genero=genero;
		this.bodrio=bodrio;
	
	}

	
	// métodos
	
	
	public void serBodrio(boolean bodrio)
	{
		this.bodrio=bodrio;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nPelicula de título " + tituloP 
				+ " y duración " + duracion + "\nGénero=" + genero 
				+(bodrio?" es un bodrio.":"Se puede ver");
	}
	
	
	
	
	
}
