package actividad13;

import javax.swing.JOptionPane;

public class Capturar 
{
	
	/*
	 * capturaEntero, método genérico para capturar un entero
	 * mediante mensaje de JOptionPane, el mensaje se introduce en el
	 * método como parámetro.
	 * Retorna el entero
	 */
	public static int capturaEntero(String mensaje)
	{
		int valor;
		try
		{
			valor=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		}
		catch(Exception e)
		{
			System.out.println("Valor introducido no válido.");
			System.out.println("Se le asigna valor 0");
			valor=0;
		}
		
		return valor;
	}
	
	
	/*
	 * capturaString
	 * Método genérico para obtener un String mediante mensaje de 
	 * JOptionPane. Retorna String
	 */
	
	public static String capturaString(String mensaje)
	{
		String valor;
		try
		{
			valor=JOptionPane.showInputDialog(mensaje);
		}
		catch(Exception e)
		{
			System.out.println("Valor introducido no válido.");
			valor="";
		}
		
		return valor;
	}
	
	
	/*
	 * capturaPosicion, método para capturar el valor de la entrada a 
	 * eliminar
	 */
	public static int capturaPosicion()
	{
		
		return capturaEntero("Introduzca número de entrada para eliminar "
				+ "(empieza en 1)");
	}
	
	
	/*
	 * capturaDni, método que retorna el valor del dni para la búsqueda
	 * por dni
	 */
	public static String capturaDni()
	{
		
		return capturaString("Introduzca numero de dni: ");
	}
	
}

