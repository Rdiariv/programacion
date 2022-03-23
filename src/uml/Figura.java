package uml;

public class Figura {

	int nLados;
	private double perimetro;
	private double area;
	
	// Constructor
	public Figura()
	{
		this.nLados=0;
		this.perimetro=0;
		this.area=0;
	}
	
	public Figura(int nLados, double perimetro, double area)
	{
		this.nLados=nLados;
		this.perimetro=perimetro;
		this.area=area;
	}

	


	

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Figura de " + nLados + " lados, perímetro " + perimetro 
				+ " y un área=" + area;
	}

}
