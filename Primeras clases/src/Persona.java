/*La primera cosa que hay que definir de una clase son atributos.
 * La segunda cosa que hay que definir son métodos (funciones)
 * : para saber como se llama la persona, poder cambiar cosas...
 * La tercera es un metodo especial llamado constructor 
 * para que reserve memoria para todos los datos relacionados */
public class Persona {
//Atributos
	int edad;
	String nombre;
	String apellidos;
	char colorPelo;
	//Contructor: se llamará igual que la clase, pero como si fuera
	//un método.
	void Persona(int edad,String nombre,String apellidos,char colorPelo){
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.colorPelo=colorPelo;
		// this se refiere a lo que está, dentro de un constructor, justo encima
	}
	
	//Métodos
	//Cambio la edad
	void setEdad(int nuevaEdad){
		edad=nuevaEdad;
		/* Hay funciones que devuelven una respuesta, con comandos 
	 * como int.
	 * Void se usa para cosas que no devuelven una respuesta
	 * También hay funciones que no tienen que recibir ninguna 
	 * información.*/
	}
	//Cambio el nombre
	void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	
	void setColorPelo(char nuevoColorPelo){
		colorPelo=nuevoColorPelo;
	}
	String devuelveNombre(){
		return nombre;
	/* 
	 * 
	 * 
	 * */
	}
}
