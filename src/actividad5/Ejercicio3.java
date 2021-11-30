/**
 * 
 */
package actividad5;
import java.util.Scanner;
/**
 * @author ruben
 *	El programa pide dos números e imprime el mayor de ellos.
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		
		//creo objeto de la clase Scanner para capturar los datos introducidos
		Scanner sc=new Scanner(System.in);
		
		//Pido datos al usuario
		System.out.println("Introduzca el primer número:");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número:");
		num2=sc.nextFloat();
		
		//Cierro el objeto de clase scanner
		sc.close();
		//imprimo en pantalla el número mayor utilizando el método max de la
		//clase Math
		System.out.println("El numero mayor es "+
		Math.max(num1, num2)+".");
		
	}
	
}		