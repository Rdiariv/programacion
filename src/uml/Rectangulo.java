package uml;

public class Rectangulo extends Figura {
	
	float altura;
	float anchura;
	private String color;

	
	//Constructor
	public Rectangulo()
	{
		super();
		this.altura=0;
		this.anchura=0;
		this.color="";
	}
	
	public Rectangulo(int nLados, double perimetro, double area, float altura
			,float anchura, String color)
	{
		super(nLados, perimetro, area);
		this.altura=altura;
		this.anchura=anchura;
		this.color=color;
	}

	//metodos
	
	public double calcPerimetro()
	{
		return (this.anchura*2+this.altura*2);
	}
	
	
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+ "\n Es un rectangulo de altura " + altura 
				+ " y base " + anchura + " , de  color " + color;
	}



}
