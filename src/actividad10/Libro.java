package actividad10;

public class Libro{


	//atributos de clase
	String titulo; //titulo del libro
	String autor;	//Autor del libro
	int numeroE;	//Numero de ejemplares
	int numeroEP;	//Numero de ejemplares prestados
	
	
	//CONSTUCTORES
	
	//Constructor por defecto
	public Libro()
	{
		
	}
	
	//Constructor con parámetros
	public Libro(String titulo, String autor, int numeroE, int numeroEP)
	{
		this.titulo=titulo;
		this.autor=autor;
		this.numeroE=numeroE;
		this.numeroEP=numeroEP;
	}

	
	//Métodos getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroE() {
		return numeroE;
	}

	public void setNumeroE(int numeroE) {
		this.numeroE = numeroE;
	}

	public int getNumeroEP() {
		return numeroEP;
	}

	public void setNumeroEP(int numeroEP) {
		this.numeroEP = numeroEP;
	}
	
	

	//METODOS
	
	/*
	 * Método prestamo:
	 * -Aumenta el número de ejemplares prestados
	 * -Disminuye el número de ejemplares disponibles
	 * Retorna true si se realiza el préstamo
	 */
	public boolean prestamo()
	{
		boolean validar=false;
		
		//si existen ejemplares realiza el prestamo
		if(numeroE>=1)
		{
			numeroE--;
			numeroEP++;
			validar=true;
			System.out.println("Se ha prestado el libro.");
		}
		else
		{
			System.out.println("No existen ejemplares para prestar.");
		}
	
		return validar;
	}
	
	
	/*
	 * Método devolucion:
	 * -Aumenta el número de ejemplares disponibles
	 * -Disminuye el número de ejemplares prestados
	 * retorna true si se realiza la devolución 
	 */
	public boolean devolucion()
	{
		boolean validar=false;
		
		//si existen ejemplares prestados realiza la devolución
		if(numeroEP>=1)
		{
			numeroE++;
			numeroEP--;
			validar=true;
			System.out.println("Se ha devuelto el libro.");
		}
		else
		{
			System.out.println("Todos los ejemplare estan en la biblioteca.");
		}
		
		return validar;
	}

	/*
	 * Metodo heredado de la superclase Object, no es un toString muy útil
	 * ya que no imprime los atributos del objeto
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/*
	 * Genero un nuevo método para imprimir los datos de los libros
	 */
	public void imprime()
	{
		System.out.println("Título: "+getTitulo()
			+"\nAutor: "+getAutor()
			+"\nLibros disponibles: "+getNumeroE()
			+"\nEjemplares prestados: "+getNumeroEP());
		
	}
	
}
	
	

	
	
	

	
	
	
	

