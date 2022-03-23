package uml;

public class Producto extends Cliente {
	
	float peso;
	float volumen;
	float precio;
	boolean envioCanarias;
	
	//Constructor
	public Producto()
	{
		super();
		this.peso=0;
		this.volumen=0;
		this.precio=0;
		this.envioCanarias=false;
	}
	
	public Producto(String nombre, String dni, int cp, float peso, 
			float volumen, float precio, boolean envioCanarias)
	{
		super(nombre, dni, cp);
		this.peso=peso;
		this.volumen=volumen;
		this.precio=precio;
		this.envioCanarias=envioCanarias;
	}

	

	//metodos
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setEnvioCanarias(boolean envioCanarias) {
		this.envioCanarias = envioCanarias;
	}
	
	
}
