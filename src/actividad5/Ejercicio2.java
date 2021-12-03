/**
 * 
 */
package actividad5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ruben
 * El programa pide el radio de un circulo y calcula su área
 * Input:
 * 			radio del circulo 
 * Output: 
 * 			área del circulo
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables
		float radio, area;
		//Creo objeto para capturar la entrada de consola
		Scanner sc=new Scanner(System.in);
		
		// pido dato al usuario e inicializo variable radio
		System.out.println("Introduzca radio del círculo.");
		radio=sc.nextFloat();
		
		//cierro objeco sc
		sc.close();
		
		//inicializo variable area con el calculo del area
		area=(float)(Math.PI*Math.pow(radio, 2));
		
		//establezco maximo de decimales
		DecimalFormat df = new DecimalFormat(); 
		df.setMaximumFractionDigits(3);
		
		//imprimo resultado en pantalla
		System.out.printf("El área del circulo de radio "+radio+" es "
				+ df.format(Math.pow(radio, 2))+"\u03c0 unidades cuadradas.\n"
				+"O lo que es lo mismo, "+df.format(area)
				+" unidades cuadradas.");
	}

}
