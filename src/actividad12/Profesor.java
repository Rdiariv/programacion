package actividad12;

public class Profesor extends Persona{
	double salario;
	
	
	//CONSTRUCTORES
	
	public Profesor()
	{
		super();
		this.salario=1000;
	}
	
	public Profesor(String nombre, int anioNacimiento, double salario)
	{
		super(nombre, anioNacimiento); //constructor con parámetros de superclase
		this.salario=salario;
	}

	
	
	//METODOS
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return super.toString()+"\nEs profesor y recibe salario de " + salario 
				+ " euros.";
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
		double descuento;
		
		/*
		 * Utilizo método calculaDescuento de la superclase
		 * para que imprima en pantalla algunos mensajes y retorne
		 * el valor de precio. Aplico el descuento y lo almaceno
		 * en la variable descuento
		 */
		descuento=super.calculaDescuento(precio)*0.02;
		
		//imprimo mensajes en pantalla para el usuario
		System.out.println("Se le aplica descuento del 2%");
		System.out.println("Pagará "+descuento+" euros menos");
		
		//retorno el valor del descuento
		return descuento;
	}
	
	
	
	
	
	

}
