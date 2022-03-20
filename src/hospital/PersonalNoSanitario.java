package hospital;

public class PersonalNoSanitario extends Persona {
	
	String empleo;
	double salario;
	//constructor
	public PersonalNoSanitario()
	{
		super();
		this.empleo="";
		this.salario=1000;
	}
	
	public PersonalNoSanitario(String nombre, String apellidos, 
			String direccion, String dni, int telefono
			, EmpleosNoSanitarios empleo, double salario)
	{
		super(nombre, apellidos, direccion, dni, telefono);
		
		
		switch (empleo)
		{
		case administrativo -> this.empleo="administrativo";
		case gerente -> this.empleo="gerente";
		case celador-> this.empleo="celador";
		case limpieza -> this.empleo="personal de limpieza";
		case seguridad -> this.empleo="seguridad";
		case informática -> this.empleo="informático";
			
		}
		
		this.salario=salario;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()	+	"Empleado como "
				+empleo+ "\nCon salario de "+ salario;
	}
	
	
	
	
}

