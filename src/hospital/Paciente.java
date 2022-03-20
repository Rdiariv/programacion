package hospital;

public class Paciente extends Persona {
	String nTarjetaSan;
	String seguridadSocial;
	String historial;
	HistoriaClinica historia=new HistoriaClinica();
	
	public Paciente()
	{
		super();
		this.nTarjetaSan="";
		this.seguridadSocial="";
		this.historial="";
	}
	
	public Paciente(String nombre, String apellidos, String direccion
			, String dni, int telefono, String nTarjetaSan, String seguridadSocial
			, String historial)
	{
		super(nombre, apellidos, direccion, dni, telefono);
		this.nTarjetaSan=nTarjetaSan;
		this.seguridadSocial=seguridadSocial;
		this.historial=historial;
		
	}

	public String getnTarjetaSan() {
		return nTarjetaSan;
	}

	public void setnTarjetaSan(String nTarjetaSan) {
		this.nTarjetaSan = nTarjetaSan;
	}

	public String getSeguridadSocial() {
		return seguridadSocial;
	}

	public void setSeguridadSocial(String seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return super.toString()+"Es paciente con tarjeta sanitaria: " + nTarjetaSan 
				+ "\nNumero de la seguridad social: " + seguridadSocial 
				+ "\nCon historial numero: "+ historial;
	}
	
	
}
