/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel=10;//inicializo la variable para no tener problemas con el while
		double numero=0;
		//creo objeto Scanner para capturar de la consola
		Scanner sc = new Scanner(System.in);
		
		while(sel!=0)
		{
			System.out.println("Menu:");
			System.out.println("1) Raiz cuadrada.\n2) Cuadrado.\n0) Salir.");
			System.out.print("Selecione una opción:");
			//asigno nuevo valor a la variable sel
			sel=sc.nextInt(); //en este caso se deberia de poner tambien
			// de forma que asegure que la entrada sea un entero para que 
			// no exista un error al hacer selección pero tambien lo tendría 
			// que poner para las otras entradas y lo ideal seria hacerlo
			// mediante un metodo y no es la finalidad del ejercicio
			
			
			switch(sel)
			{
				case 1: //elige calcular la raiz
					System.out.println("\nIntroduzca número:");
					numero=sc.nextDouble();
					System.out.println("La raíz cuadrada de "+numero+
							" es "+Math.sqrt(numero));
				break;
				
				case 2: // elige calcular el cuadrado
					System.out.println("Introduzca número:");
					numero=sc.nextDouble();
					System.out.println("El cuadrado de "+numero+
							" es "+Math.pow(numero,2));
				break;
				
				case 0: //elige salir
					System.out.println("Gracias por utilizar este programa.");
				break;
				
				default:
				System.out.println("Opción incorrecta, introduzca un valor "+
						"entre 0 y 2");
				break;
				
				
			}
		}
		//cierro entradas de consola
		sc.close();
	}
}
