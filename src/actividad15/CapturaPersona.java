package actividad15;

public class CapturaPersona {
	
	public static Persona capturaPersona()
	{
		Persona p;
		Direccion d;
		String person[]= {"nombre", "apellidos", "dni", "edad", 
				"calle", "numero", "cp", "provincia"};
		
		
		for (int i=0; i<8; i++)
		{
			person[i]=Capturar.capturaString("Introduzca "+person[i]+".");
			System.out.println();
		}
		//creo la direccion
		d=new Direccion(person[4], Integer.parseInt(person[5]), 
				Integer.parseInt(person[6]),person[7]);
		//creo la persona
		p=new Persona(person[0], person[1], Integer.parseInt(person[2]), 
				Integer.parseInt(person[3]), d);
		
		return p;
	}

}
