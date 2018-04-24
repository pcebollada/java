
public class ManejaPersonasVivientes {
		public static void main(String[] args) {
			PersonasVivientes persona1,persona2;
			FechaNacimiento nuevaFecha;
			nuevaFecha=new FechaNacimiento(19,4,2018);
			persona1=new PersonasVivientes("Hulio","Pérez","López",nuevaFecha);
			System.out.println("Me llamo "+ persona1.getNombre());

		}

	}
