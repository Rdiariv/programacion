package hospital;

public class HistoriaClinica{
	
	private int nEntrada=0;
	//atributo historia, es un array con primera columna para la fecha
	// y segunda columna para la entrada
	private String historia[][]=new String [100][2];
	
	//Constructor vacio
	public HistoriaClinica()
	{
		for(int i=0; i<100; i++)
		{
			this.historia[i][0]="";
			this.historia[i][1]="";
		}
	}
	
	
	//Método para añadir entradas al historial del paciente
	
	public void entradaHisto(String fecha, String entrada)
	{
		this.historia[nEntrada][0]=fecha;
		this.historia[nEntrada][1]=entrada;
		
		this.nEntrada++;
	
	}
	
	
	
	
	//Muestra las entradas del historial con codigo codHistorial
	public void verHistorial()
	{
		System.out.println("\nPresenta la historia clínica:");
		for(int i=0; i<nEntrada; i++)
		{
			System.out.println("Día "+this.historia[i][0]);
			System.out.println(this.historia[i][1]);
		}
		
	}
	

}
