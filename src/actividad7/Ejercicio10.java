/**
 * 
 */
package actividad7;

import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro variables
				int numero;
				int factorial=1;
				boolean interruptor=false;
				
				//Creo objeto sc para las entradas del usuario
				Scanner sc = new Scanner(System.in);
				
				//bucle para pedir entrada al usuario
						while(interruptor==false)
						{
							System.out.print("\nIntroduzca un número:");
							
							if(sc.hasNextInt()==true)//si la entrada es valida
							{
								/*
								 * Asigno valor introducido a numero
								 * interruptor para cancelar el bucle while
								 */
								numero=sc.nextInt();
								interruptor=true;
								
								//imprimo mensaje en pantalla
								System.out.print(numero+"!=");
								
								//imprimo el factorial de numero
								for(int i=1; i<=numero; i++)
								{
									factorial=factorial*i;
									System.out.print(i);
									if(i!=numero)
									{
										System.out.print("*");
									}
									else
									{
										System.out.println("="+factorial);
									}
								}
								//Fin de si la entrada es válida
							}
							else
							{
								//Si no es entrada valida aviso al usuario
								System.out.println("Entrada no válida.");
							}
						
							//reinicio objeto clase Scanner
							sc = new Scanner(System.in);
							
						}
					
					//Cierro objeto sc
					sc.close();


	}

}
