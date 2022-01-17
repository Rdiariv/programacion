package actividad8;

import java.util.Arrays;

public class Vector {

	//atributo de clase
	int vector[]=new int[20];
	
	
	//constructor
	public Vector()
	{
		for(int i=0; i<20; i++)
		{
			vector[i]=(int)(Math.random()*10+1);
		}
	}


	//METODOS
	
	//retorna el vector como una cadena de caracteres
	public String toString() {
		return "[" + Arrays.toString(vector) + "]\n";
	}
	
	
	//retorna la media de los valores del vector
	public double media()
	{
		double med=0;//declaro e inicializo variable para la media
		
		//sumo en la variable med todos los valores del array
		for(int i=0; i<20; i++)
		{
			med=med+vector[i];
		}
		
		//retorno el valor de med dividido entre el número de valores del array
		return (med/20);
	}
	
	
	//retorna el valor máximo valor del array
	public int vectormax()
	{
		int valor=0;
		//recorro el array
		for(int i=0; i<20; i++)
		{
			/*
			 * Si el valor de la posición del array es mayor que
			 * el valor almacenado en valor sustituyo este
			 */
			if(vector[i]>valor)
			{
				valor=vector[i];
			}
		}
		
		//retorno valor
		return valor;
	}
	
	
	//retorna el valor mínimo del array
	public int vectormin()
	{
		//declaro e inicializo variable valor con el valor maximo del array 
		int valor=10;
		//recorro el array
		for(int i=0; i<20; i++)
		{
			/*
			 * Si el valor del elemento del array es menor que el almacenado
			 * en valor sustituyo este ultimo
			 */
			if(vector[i]<valor)
			{
				valor=vector[i];
			}
		}
		
		//retorno el valor mínimo
		return valor;
	}
}
