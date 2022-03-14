package actividad12;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//instancio clase Profesor en un objeto de la superclase Persona
		Persona person1=new Profesor("Roger", 1979, 3250);
		System.out.println(person1.toString()+"\n");
		
		//instancio clase Alumno en un objeto de la superclase Persona
		Persona person2=new Alumno("Rubén", 1982, "Primero de DAM");
		System.out.println(person2.toString()+"\n");
		
		
		/*
		 * Utilizo método calculaDescuento de la clase Persona
		 * Pero al estar instanciado como las subclases (profesor y alumno)
		 * utiliza el método de estos últimos para retornar el valor del 
		 * descuento
		 */
		double precio=100;
		
		System.out.println(person1.toString());
		precio=precio-person1.calculaDescuento(precio);
		System.out.println("En total pagará "+precio+"\n");
		
		precio=100;
		
		System.out.println(person2.toString());
		precio=precio-person2.calculaDescuento(precio);
		System.out.println("En total pagará "+precio+"\n");
		
	}

}
