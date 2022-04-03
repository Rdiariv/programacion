package actividad13;

public class CapturaPersona {
	
	public static Persona capturaPersona()
	{
		Persona p;
		Direccion d;
		String person[]= {"nombre", "apellidos", "dni", "edad", 
				"calle", "cp", "provincia"};
		
		/*
		 * Utilizo el mismo vector person, con los String de los campos a
		 * rellenar y confome los voy pidiendo al usuario los voy 
		 * sobreescribiendo
		 */
		for (int i=0; i<7; i++)
		{
			person[i]=Capturar.capturaString("Introduzca "+person[i]+".");
			System.out.println();
		}
		//creo la direccion
		d=new Direccion(person[4], Integer.parseInt(person[5]), person[6]);
		//creo la persona
		p=new Persona(person[0], person[1], person[2], 
				Integer.parseInt(person[3]), d);
		
		return p;
	}

}
