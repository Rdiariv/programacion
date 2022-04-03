package actividad13;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		Lista lista = new Lista();
		
		
		do
		{
			System.out.println("Menú principal:");
			System.out.print("1) Cargar.\n2) Listar.\n3) Insertar.\n"
					+ "4) Eliminar.\n5) Contar\n6) Buscar.\n7) Ordenar.\n"
					+ "0) Salir.\n\n");
			try
			{
				sel=Integer.parseInt(JOptionPane.showInputDialog("Seleccione "
						+ "opción."));
			}
			catch(Exception e)
			{
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
				lista.buscar(Capturar.capturaDni());
			break;
			
			case 7:
				lista.ordenar();
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
