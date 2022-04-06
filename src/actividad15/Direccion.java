package actividad15;

public class Direccion {
	
	String calle;
	Integer numero;
	Integer cp;
	String provincia;
	
	
	//CONSTRUCTORES
	
	public Direccion()
	{
		this.calle="";
		this.cp=0;
		this.provincia="";
	}
	
	
	public Direccion(String calle, Integer numero ,Integer cp, String provincia) {
		this.calle = calle;
		this.numero=numero;
		this.cp = cp;
		this.provincia = provincia;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public Integer getCp() {
		return cp;
	}


	public void setCp(Integer cp) {
		this.cp = cp;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Override
	public String toString() {
		return "Dirección: " + calle + ", numero "+numero+"\nCP: " + cp + 
				", provincia: " + provincia;
	}
	
	
	
}
