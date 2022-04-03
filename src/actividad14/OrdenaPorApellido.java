package actividad14;
import java.util.Comparator;

public class OrdenaPorApellido implements Comparator<Persona> {
	

	public int compare(Persona a, Persona b)
	{
		int res = String.CASE_INSENSITIVE_ORDER.compare(a.apellidos, b.apellidos);
		if (res == 0) {
	res = a.apellidos.compareTo(b.apellidos);
	}
	return res;
	}
}
