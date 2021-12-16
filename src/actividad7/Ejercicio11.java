/**
 * 
 */
package actividad7;

/**
 * @author ruben
 *	El programa busca en un vector el valor maximo
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro e inicializo variables
		int vector[]= {1, 524, 423, 825, 1524, 324, 899, 975, 775, 657};
		int mayor=0;
		
		//bucle for recorre el vector
		for(int i=0; i<10; i++)
		{
			/*
			 * Si encuentro un valor en el vector que sea mayor que el 
			 * almacenado en mayor lo guardo en la variable mayor
			 */
			if(vector[i]>mayor)
			{
				mayor=vector[i];
			}
		}

		//imprimo el maximo valor en pantalla
		System.out.println("El valor mas alto es "+mayor);
	
	}

}
