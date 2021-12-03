/**
 * 
 */
package actividad4;

import java.util.Scanner;

/**
 * @author ruben
 * El programa pide al usuario una hora y una cantidad de horas y devuelve
 * la hora que marcará el reloj una vez pasadas esas horas
 */ 
public class ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Declaración de variables siendo hora la hora actual
		 * nHora el número de horas que han de pasar
		 * fHora la hora que marcará el reloj una vez pasadas las nHoras
		 */
		int hora, nHora, fHora;
		float multiplicador; //variable para obtener la proporción de horas

		//creo objeto sc de la clase Scanner
		Scanner sc=new Scanner(System.in);
		
		//Pido al usuario datos e inicializo las variables
		System.out.println("Introduzca hora actual:");
		hora=sc.nextInt();
		System.out.println("Introduzca número de horas que pasarán:");
		nHora=sc.nextInt();
		
		//metodo close de la clase Scanner para cerrar las entradas de teclado
		sc.close();
		
		//Calculo de horas
		fHora=hora+nHora;
		
		/*
		 * CONSIDERO QUE ES MAS EFICIENTE DE LA MANERA QUE DEJO COMENTADA AQUI
		 * 
		 * 
		 * //Si obtenemos un número de horas mayor que 12, las que marca el reloj
		 *			
		 *		if(fHora>12)
		 *		{
		 *			//obtengo el resto de la división exacta, serán las horas
		 *			//que no completan 12 horas, es decir, las horas de mas
		 *			fHora=fHora%12;
		 *		}
		 */
		
		//Si obtenemos un número de horas mayor que 12, las que marca el reloj
		if(fHora>12)
		{
			//Obtengo el número de veces que el reloj pasa por la hora inicial
			//con decimales
			multiplicador=(float)fHora/12;
		
			//obtengo la parte decimal del multiplicador restando la entera
			multiplicador=multiplicador-(int)multiplicador;
			
			//obtengo el numero de horas a partir de la ultima pasada por
			//la hora inicial
			fHora=(int)(multiplicador*12);
		}
		
		
		System.out.println("Al pasar " + nHora + " horas el reloj marcará las " 
		+ fHora);	
	
	}

}
