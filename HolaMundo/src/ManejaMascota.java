
public class ManejaMascota {

	public static void main(String[] args) {
		//cuqui es el objeto, podemos sacar infinitas Mascotas.
				//Mascota es la clase, es como el molde.
		Mascota  cuqui;
		cuqui= new Mascota("cuqui",3,"perro",'h');

				//Para poder acceder a los atributos de una clase, hay que acceder a trav�s de los metodos set y get
				System.out.println("Mi mascota se llama "+cuqui.getNombre());
				System.out.println("Mi mascota tiene "+cuqui.getEdad()+" a�os");
				System.out.println("Mi mascota es un "+cuqui.getEspecie());
				System.out.println("Mi mascota es un/a "+cuqui.getSexo());
				//pasa un a�o
				cuqui.setEdad(4);
				System.out.println("Mi mascota tiene ahora "+cuqui.getEdad()+" a�os");
				System.out.println(("El a�o de nacimiento de mi mascota es: ")+cuqui.getAnioNacimiento(2018));
		}

}

/* Una clase tiene atributos, que es lo que guardamos de esa clase
 * Luego est�n los m�todos, que es donde podemos decir de inicio algunos atributos de lo que hablamos.
 * 
 *  Caracter�sticas de un lenguaje dedicado a objetos:
 * - Encapsulaci�n: tiene que ver en la manera como unos objetos se comunican con otros. Se crean canales
 * espec�ficos para sacar informaci�n de la clase, en concreto los elementos setter and getter.
 *
 * - Polimorfismo: consiste en tener diferentes m�todos que hacen cosas parecidas con el mismo nombre,
 * pero que tienen una peque�a diferencia entre ambas: que reciban diferentes datos o que los datos los reciba
 * en distinto orden. (para ejemplo mirar Mascota.java, los dos �ltimos m�todos)
 * 
 *  - Herencia: tambi�n llamada especializaci�n. Se puede crear una clase, basada en otra clase, especializando
 *  algunos aspectos. Va a tener una clase hija basada en una clase padre pero a�adiendo unos detalles. Algunos 
 *  ejemplos son:
 * Una persona que vive en un pa�s (clase padre); y un alumno (clase hija), ya que es un tipo especial que vive en 
 * un pa�s, que adem�s est� matriculado en un colegio.
 * No hay que confundir una clase hija con un objeto. Un objeto es un ejemplo de una clase hija. Una clase 
 * es el dise�o, el c�mo va a ser. El objeto ser� lo que use para un programa y haya un guardado de memoria previo
 * 
 * Se pueden crear muchos objetos encadenados. Por ejemplo, puedes crear un objeto que tenga 3 atributos; y luego 
 * crear otro objeto que dependa del anterior (XXXXXX= new YYYYYYY, siendo YYYYY el objeto que hemos creado antes
 * ), pero tendr�amos que poner los atributos que ten�a el anterior as�:
 * 
 * 
 */