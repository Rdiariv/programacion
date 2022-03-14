package actividad12;

public class Alumno extends Persona{
	String curso;

	//CONSTRUCTORES
	public Alumno()
	{
		super();
		this.curso="0";
	}
	
	public Alumno(String nombre, int anioNacimiento, String curso)
	{
		super(nombre, anioNacimiento);
		this.curso=curso;
	}

	
	//MÉTODOS
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString()+"\nEs alumno del curso " + curso;
	}
	
	
	//Metodo calculaDescuento
		@Override
		public double calculaDescuento(double precio) {
			// TODO Auto-generated method stub
			/*
			 * Utilizo el método de la superclase para que retorne el valor
			 * del precio sin descuento y los mensajes por pantalla y lo modifico
			 * aplicando el descuento del 2% al precio
			 * Retorna el valor del descuento
			 */
			double descuento; //variable para almacenar el descuento
			
			/*
			 * Utilizo método calculaDescuento de la superclase
			 * para que imprima en pantalla algunos mensajes y retorne
			 * el valor de precio. Aplico el descuento y lo almaceno
			 * en la variable descuento
			 */
			descuento=super.calculaDescuento(precio)*0.1;
			
			//Mensajes en pantalla al usuario
			System.out.println("Se le aplica descuento del 10%");
			System.out.println("Pagará "+descuento+" euros menos");
			
			//retorno valor del descuento
			return descuento;
		}
	
	
	
}
