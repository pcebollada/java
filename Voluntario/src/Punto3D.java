
public class Punto3D {
	private float x;
	private float y;
	private float z;
	private char letra;
	
	public Punto3D(float x, float y, float z, char letra) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.letra = letra;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
}
