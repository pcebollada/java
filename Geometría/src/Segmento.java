
public class Segmento {
	private Punto P1;
	private Punto P2;
	public Segmento(Punto p1, Punto p2) {
		super();
		P1 = p1;
		P2 = p2;
	}
	public Punto getP1() {
		return P1;
	}
	public void setP1(Punto p1) {
		P1 = p1;
	}
	public Punto getP2() {
		return P2;
	}
	public void setP2(Punto p2) {
		P2 = p2;
	}
	
	public double getDistance(){
		double distance;
		//Vamos a calcular la distancia entre dos puntos, y va a formar un triángulo equilatero.
		//La formula será distancia**2= (x1-x2)**2
		double c1,c2;
		c1=P2.getX()-P1.getX();
		c2=P2.getY()-P1.getY();
		distance=Math.sqrt(Math.pow(c1, 2)+(Math.pow(c2, 2)));
		return distance;
	}
	
	
}
