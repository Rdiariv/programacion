package uml;

public class Libro extends Producto {

	String autor;
	String titulo;
	private float pesol;
	int nPaginas;
	
	public Libro()
	{
		super();
		this.autor="";
		this.titulo="";
		this.pesol=0;
		this.nPaginas=0;
		
	}
	
	public Libro(String nombre, String dni, int cp, float peso, float volumen
			, float precio, boolean envioCanarias, String autor, String titulo
			, float pesol, int nPaginas)
	{
		super(nombre, dni, cp, peso, volumen, precio, envioCanarias);
		this.autor=autor;
		this.titulo=titulo;
		this.pesol=pesol;
		this.nPaginas=nPaginas;
	
	}

	
	//métodos
	
	@Override
	public String toString() {
		return super.toString()+"\nLibro escrito por " + autor 
				+ ", titulado " + titulo + " con peso " + pesol 
				+ " y número de páginas" + nPaginas;
	}

	//Método para estimar las horas de lectura
	public float estimaH()
	{
		float h=this.nPaginas*2.2f;
		return h;
	}

}



