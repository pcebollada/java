
public class Mascota {
	String nombre;
	int edad;
	String especie;
	char sexo;
	//Hecho seleccionando los atributos y con Source-----> Generate Constructor Using Fields (last member)
	public Mascota(String nombre, int edad, String especie, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.sexo = sexo;
	}
	//Hecho seleccionando los atributos y con Source-----> Generate Getters and Setters (last member)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnioNacimiento(int anioActual){
		int anioNacimiento;
		anioNacimiento= anioActual-edad;
		return (anioNacimiento);
	}
	//La diferencia es que el de arriba te da la opción de especificar el año, el otro siempre toma 2018 como año
	public int getAnioNacimiento(){
		int anioActual=2018;
		int anioNacimiento;
		anioNacimiento= anioActual-edad;
		return (anioNacimiento);
	}
}
