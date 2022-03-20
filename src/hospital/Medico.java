package hospital;

public class Medico extends PersonalSanitario {
	//atributos de clase
	String especialidad;
	double complemento;
	
	//Constructor vacío
	public Medico()
	{
		//constructor con parámetros para añadir el sueldo base
		//y el empleo de médico
		super("", "", "", "", 0, 0, 2000, "médico");
		this.especialidad="";
		this.complemento=0;
		
	}
	
	//Constructor con parámetros
	public Medico(String nombre, String apellidos, String direccion, String dni
			, int telefono, int codigoPer, double salario, 
			String especialidad, double complemento)
	{
		super(nombre, apellidos, direccion, dni, telefono, codigoPer
				, salario, "médico");
		this.especialidad=especialidad;
		this.complemento=complemento;
	}

	//Getters y setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	//método toString con método de superclase
	@Override
	public String toString() {
		return super.toString()+"\nEs médico " + especialidad 
				+ "\nPercibe un complemento de " + complemento;
	}
	
	

}
