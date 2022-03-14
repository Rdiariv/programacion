package actividad11;

public class EstudianteInt extends Estudiante{
	
	//ATRIBUTOS DE CLASE
	boolean esErasmus;
	String nacionalidad;
	
	//MÉTODOS
	//constructores
	public EstudianteInt()
	{
		super();
		this.esErasmus=false;
		this.nacionalidad="";
	}
	
	public EstudianteInt(String nombre, String direccion, String codigo, 
			boolean esErasmus, String nacionalidad)
	{
		super(nombre, direccion, codigo);
		this.esErasmus=esErasmus;
		if(nacionalidad.equalsIgnoreCase("inglés") 
				|| nacionalidad.equalsIgnoreCase("francés")
				|| nacionalidad.equalsIgnoreCase("portugués")
				|| nacionalidad.equalsIgnoreCase("americano"))
		{
			this.nacionalidad=nacionalidad;
		}
		else
		{
			this.nacionalidad="";
			System.out.println("La nacionalidad introducida no es correcta");
		}
	}
	
	//getters & setters
	public boolean isEsErasmus() {
		return esErasmus;
	}

	public void setEsErasmus(boolean esErasmus) {
		this.esErasmus = esErasmus;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/*
	 * Método esEuropeo, devuelve true si el estudiante es europeo y false
	 * si no es europeo
	 */
	public boolean esEuropeo()
	{
		boolean europeo=false;
		
		if(this.nacionalidad.equalsIgnoreCase("ingés")
				|| this.nacionalidad.equalsIgnoreCase("francés")
				|| this.nacionalidad.equalsIgnoreCase("portugués"))
		{
			europeo=true;
		}

		return europeo;
	}
	
	/*
	 * método descuentoParaJóvenes. Devuelve true si el alumnos es de erasmus y
	 * menor de 25 años
	 */
	public boolean descuentoParaJovenes()
	{
		boolean descuento=false;
		
		if(this.esErasmus==true && this.edad<25)
		{
			descuento=true;
		}
		
		return descuento;
	}

	@Override
	public String toString() {
		String mensaje="";
		
		if(this.esErasmus==true)
		{
			mensaje="Estudiante de erasmus.";
		}
		else
		{
			mensaje="Estudiante no erasmus.";
		}
		
		return super.toString()+" "+mensaje+" Nacionalidad: "+nacionalidad;
	}
	
	
	

}
