package uml;

public class Pared {
	public float altura;
	public float anchura;
	public String color;

	//Constructor
	public Pared()
	{
		this.altura=0;
		this.anchura=0;
		this.color="";
	}
	
	public Pared(float altura, float anchura, String color)
	{
		this.altura=altura;
		this.anchura=anchura;
		this.color=color;
	}
	
	
	//METODS
	public double calculaArea()
	{
		double a;
		
		a=this.altura*this.anchura;
		
		return a;
	}
	
	public double cantidadPintura()
	{
		double pint;
		
		//area por 0.43 litros por metro cuadrado
		pint=this.calculaArea()*0.43;
		
		return pint;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
}
