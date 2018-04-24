
public class Edificio {
	//Esto es privado. Este atributo no se va a poder cambiar de ninguna 
	//de las dos formas que nos enseñaron. Esto es un ejemplo de encapsulación
	private String direccion;
	private int codigoPostal;
	private int altura;
	private boolean calefaccionCentral; //Un boolean es algo que dice si es verdadero o no
	public Edificio(String direccion, int codigoPostal, int altura, boolean calefaccionCentral) {
		//super();
		//Este va a ser la que nos permita mandar información a las clases hijas. LA PONGO COMO COMENTARIO PARA RECORDARLA.
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.altura = altura;
		this.calefaccionCentral = calefaccionCentral;
	}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public int getCodigoPostal() {
			return codigoPostal;
		}
		public void setCodigoPostal(int codigoPostal) {
			this.codigoPostal = codigoPostal;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public boolean isCalefaccionCentral() {
			return calefaccionCentral;
		}
		public void setCalefaccionCentral(boolean calefaccionCentral) {
			this.calefaccionCentral = calefaccionCentral;
		}
	}