package hospital;

public class PersonalSanitario extends Persona{

	int codigoPer;
	double salario;
	String empleo;
	
	public PersonalSanitario() {
		super();
		this.codigoPer = 0;
		this.salario = 1000;
		this.empleo = "";
	}
	
	
	public PersonalSanitario(String nombre, String apellidos, String direccion,
			String dni, int telefono, int codigoPer, double salario, 
			String empleo)
	{
		super(nombre, apellidos, direccion, dni, telefono);
		this.codigoPer=codigoPer;
		this.salario=salario;
		this.empleo=empleo;
	}


	
	


	public int getCodigoPer() {
		return codigoPer;
	}


	public void setCodigoPer(int codigoPer) {
		this.codigoPer = codigoPer;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getempleo() {
		return empleo;
	}


	public void setempleo(String empleo) {
		this.empleo = empleo;
	}


	@Override
	public String toString() {
		return super.toString()+"Codigo personal: " + codigoPer 
				+ "\nSalario: " + salario + "\nempleo: " + empleo;
	}
	
	
	
}
