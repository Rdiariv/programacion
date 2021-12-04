/**
 * 
 */
package actividad5;

/**
 * @author ruben 
 *	El programa genera un número aleatorio entre 1 y 10 y lo imprime en pantalla
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El número que genera será un entero
		short numero;
		
		//obtengo un valor para numero usando el método random de la clase Math
		numero=(short)(Math.random()*10+1);
		
		//Imprimo el número en pantalla
		System.out.println("El valor aleatorio obtenido es "+numero);
	
	}

}
