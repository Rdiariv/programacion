package uml;

public class Ventana extends Pared {
	
	double largo;
	double ancho;
	double peso;
	private boolean dobleCristal;
	
	//Constructor
	public Ventana()
	{
		super();
		this.largo=0;
		this.ancho=0;
		this.peso=0;
	}
	
	public Ventana(float altura, float anchura, String color, double largo, 
			double ancho, double peso, boolean dobleCristal)
	{
		
		super(altura, anchura, color);
		
		this.largo=largo;
		this.ancho=ancho;
		this.peso=peso;
		this.dobleCristal=dobleCristal;
	}
	
	//métodos
	
	public double calculaArea()
	{
		double area=this.largo*this.ancho;
		return area;
	}
	
	public double calculaPrecio()
	{
		double precio;
		//estimación del costo del material
		precio=(this.largo+this.ancho)*70;	
		return precio;
	}
	
	public boolean getDobleCristal()
	{
		return this.dobleCristal;
	}

}
