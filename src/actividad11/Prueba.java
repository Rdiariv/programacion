package actividad11;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//person1, clase Persona
		Persona person1 = new Persona("Ruben", "calle importante", 39);
		System.out.println(person1.toString());
		System.out.println(person1.mayorEdad()?"es mayor de edad":"es menor de edad");
		System.out.println("");
		
		//person2, clase Estudiante, uso constructor vacio
		Estudiante person2=new Estudiante();
		person2.setNombre("John Rambo");
		person2.setDireccion("Calle vietnam");
		person2.setCodigo("charlie");
		person2.setEdad(41);
		System.out.println(person2.toString());
		System.out.println("");
		
		//person3, clase Persona, uso constructor con parámetros
		// en el ejercicio se pedia el constructor sin el valor de edad
		Estudiante person3=new Estudiante("Yarunay", "calle simpatía", "sarcasmo");
		person3.setEdad(24);
		System.out.println(person3.toString());
		System.out.println(person3.mayorEdad()?"Es mayor de edad.":"Es menor de edad.");
		System.out.println("");
		
		//person4 y person5, clase Estudianteint
		EstudianteInt person4 = new EstudianteInt("ruben", "calle felicidad", "awesome", true, "inglés");
		person4.setEdad(38);
		System.out.println(person4.toString());
		System.out.println("Descuento para jóvenes: "+ person4.descuentoParaJovenes());
		System.out.println("");
		
		EstudianteInt person5 = new EstudianteInt("andrea", "calle barcelona", "3sddsl", true, "americano");
		person5.setEdad(22);
		System.out.println(person5.toString());
		System.out.println("Descuento para jóvenes: "+person5.descuentoParaJovenes());
	
	}

}
