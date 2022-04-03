package actividad14;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		Lista lista = new Lista();
		
		
		do
		{
			System.out.println("\nMenú principal:");
			System.out.print("1) Cargar.\n2) Listar.\n3) Insertar.\n"
					+ "4) Eliminar.\n5) Contar\n6) Buscar por DNI.\n"
					+ "7) Buscar por nombre.\n8) Ordenar.\n9) Guardar como CSV."
					+ "\n0) Salir.\n\n");
			try
			{
				sel=Integer.parseInt(JOptionPane.showInputDialog("Seleccione "
						+ "opción."));
			}
			catch(Exception e)
			{
				//Si la entrada no es correcta pongo valor para que salte el
				//default
				sel=100;
			}
			
			switch (sel) 
			{
			case 1: 
			
				lista.cargar();	
			
			break;
			
			case 2:
			
				lista.listar();
			break;
			
			case 3:
				lista.insertar(CapturaPersona.capturaPersona());
			break;
			
			case 4:
				lista.eliminar(Capturar.capturaPosicion());
			break;
			
			case 5:
				System.out.println("El número de entradas en la lista es "
						+lista.contar()+".\n");
			break;
			
			case 6:
				lista.buscarDni(Capturar.capturaDni());
			break;
			
			case 7:
				lista.buscarNombre(Capturar.capturaString("Introduzca nombre "
						+ "para buscar"));
			break;
			
			case 8:
				lista.ordenar();
			break;
			
			case 9:
				lista.guardarCSV(Capturar.capturaString("Introduzca nombre "
						+ "de archivo"));
			break;
			
			case 0:
				System.out.println("Gracias por utilizar mi programa. "
						+ "Hasta la próxima");
			break;
			
			default:
			
				System.out.println("Entrada no válida.");
			break;
			}
			
		}while(sel!=0);
		
	}

}
