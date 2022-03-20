package hospital;

public class PersonalExterno extends Persona {
	int numPase;
	String observaciones;

	//Solo existe constructor con parámetros porque no vamos a dejar
	//entrar al hospital a alguien sin registrar
	public PersonalExterno(String nombre, String apellidos, String direccion,
			String dni, int telefono, int numPase, String observaciones)
	{
		super(nombre, apellidos, direccion, dni, telefono);
		this.numPase=numPase;
		this.observaciones=observaciones;
	}

	//getters y setters
	public int getNumPase() {
		return numPase;
	}

	public void setNumPase(int numPase) {
		this.numPase = numPase;
	}

	//método toString con el método de la superclase y 
	@Override
	public String toString() {
		return super.toString()+"Personal externo con número de pase: " 
				+ numPase+"\nObservaciones:\n"+observaciones;
	}
	
	

}
