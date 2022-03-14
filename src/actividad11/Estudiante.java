package actividad11;

public class Estudiante extends Persona{
	
	//ATRIBUTOS DE CLASE
	private String codigo;
	
	
	//MÉTODOS CONSTRUCTORES
	public Estudiante()
	{
		super();
		this.codigo="";
	}
	
	/*
	 * Constructor con parámetros, no esta la edad porque en el enunciado
	 * de la actividad no lo especificaba. Por esta razon la inicializo a 0
	 */
	public Estudiante(String nombre, String direccion, String codigo)
	{
		super(nombre, direccion, 0);
		this.codigo=codigo;
	}

	
	
	//METODOS
	
	//getters & setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return  super.toString()+"\nEs estudiante con código " + codigo + ".";
	}
	
	
	
}
