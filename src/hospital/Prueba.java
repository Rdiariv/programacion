package hospital;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonalSanitario person1 = new PersonalSanitario("Andrés", "Gonzalez", 
				"Calle Jornada", "8383839p", 999292919, 4332, 
				35000, "Enfermero");
		
		Medico person2 = new Medico("Charles", "Bronson", "Calle Problemas"
				, "234567878P", 738399272, 234, 2000, "cirujano", 1000);
		
		PersonalNoSanitario person3 = new PersonalNoSanitario("Arnaldo", "Suaréz Lozano", "Calle Arafero", 
				"23443932K", 73882888, EmpleosNoSanitarios.limpieza, 1200);
		
		Paciente person4 = new Paciente("Jeremias", "Díaz Piñero"
				, "Calle El Pino", "433234343h", 4553533
				, "34dse", "sdssd", "456gh");
		
		person4.historia.entradaHisto("21/04/2021","El paciente presenta "
				+ "tendencias suicidas tras golpearse la cabeza con un teclado");
		
		person4.historia.entradaHisto("12/07/2021", "El paciente presenta dolor "
				+ "de espalda. Es diagnosticado con hernia");
		
		//Tenemos una visita al hospital por lo que se le toman los datos
		PersonalExterno person5 = new PersonalExterno("Genaro", "García García"
				, "Calle Pintura", "78522365z", 95662556, 132
				, "Servicio técnico cafetería");

		//personal sanitario, enfermero
		System.out.println(person1.toString());
		
		//Personal sanitario, medico
		System.out.println(person2.toString());
		
		//Personal no sanitario, seguridad
		System.out.println(person3.toString());
		
		//Paciente
		System.out.println(person4.toString());
		person4.historia.verHistorial();
		
		//Personal externo
		System.out.println(person5.toString());
	}

}
	