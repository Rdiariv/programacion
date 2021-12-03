/**
 * 
 */
package actividad5;

/**
 * @author ruben 
 *	Programa que simula una partida de dados entre dos jugadores
 *	imprime en pantalla el resultado de cada lanzamiento y nos dice que valor
 *	es mayor
 *	La partida consiste en el lanzamiento de un dado de 6 por cada jugador en
 *	4 rondas
 *
 *
 *
 *
 *	YO HUBIESE UTILIZADO UN VECTOR PARA ALMACENAR LAS VARIABLES Y HUBIESE
 *	AHORRADO LA MITAD DEL CÓDIGO PERO COMO AÚN NO LOS HEMOS VISTO NO QUIERO 
 *	ADELANTARME
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro variables
		int dado;
		int score1=0, score2=0;
		float media1=0, media2=0;
		
		System.out.println("Inicio de la partida:\n");
		
		
		/*
		 * El bucle for es el encargado de hacer cada ronda, podia haber puesto
		 * otro bucle for para los jugadores pero no queria utilizar vectores.
		 */
		for(int i=1; i<=2; i++) 
		{
			System.out.println("Ronda "+i+":\n------------------------");
				
				//Jugador 1
				System.out.println("Jugador 1:"); 
				
				//Lanzamiento primer dado jugador 1
				dado=(int)(Math.random()*6+1); 
				System.out.println("\tDado 1: "+dado);
				
				score1=score1+dado;//suma de puntuacion
				
				//lanzamiento segundo dado jugador 1
				dado=(int)(Math.random()*6+1);
				System.out.println("\tDado 2: "+dado);
				
				score1=score1+dado;//suma de puntuacion jugador 1
				
				//Suma para la media de todos los lanzamientos del jugador 1
				media1=media1+score1; 
				//La media no se reinicia en el bucle
				
				//Jugador 2
				System.out.println("Jugador 2:"); 
				
				//Lanzamiento primer dado jugador 2
				dado=(int)(Math.random()*6+1);
				System.out.println("\tDado 1: "+dado);
				
				score2=score2+dado; //suma de puntuacion
				
				//lanzamiento segundo dado jugador 2
				dado=(int)(Math.random()*6+1);
				System.out.println("\tDado 2: "+dado);
				
				score2=score2+dado;//suma de puntuacion jugador 2
				
				//Suma para la media de todos los lanzamientos del jugador 2
				media2=media2+score2;
				//la media no se reinicia en el bucle
				
				System.out.println("\n");
				
				
				//Puntuación mas alta de la ronda
				
				if(score1!=score2)
				{
					System.out.println("La tirada mas alta es "
							+Math.max(score1, score2));
				}
				
				//Muestro mensaje de quien gana la ronda
				if(score1>score2) 				//gana el 1
				{
					System.out.println("Gana el jugador 1.");
				}
				else if(score1<score2)			//gana el 2
				{
					System.out.println("Gana el jugador 2.");
				}
				else							//en caso de empate
				{
					System.out.println("El resultado es empate");
				}
				
				
				
				System.out.println("");//un salto de linea
					
					
				//Reinicio de la puntuación para la siguiente ronda
				score1=0;//jugador 1
				score2=0;//jugador 2
				
		
		}
		
		
		/*
		 * Muestro la media redondeada a entero
		 */
		System.out.println("-------------------------------------------------");
		//redondeo media del jugador 1 y la imprimo en pantalla
		System.out.println("La media de los lanzamientos del jugador 1 es "
				+Math.round(media1/4));
		//redondeo media del jugador 2 y la imprimo en pantalla
		System.out.println("La media de los lanzamientos del jugador 2 es "
				+Math.round(media2/4));			
			
		}
			

	}


