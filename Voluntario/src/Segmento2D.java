
public class Segmento2D {
	private Punto2D P1;
	private Punto2D P2;
	
	public Segmento2D(Punto2D p1, Punto2D p2) {
		super();
		P1 = p1;
		P2 = p2;
	}
	public Punto2D getP1() {
		return P1;
	}
	public void setP1(Punto2D p1) {
		P1 = p1;
	}
	public Punto2D getP2() {
		return P2;
	}
	public void setP2(Punto2D p2) {
		P2 = p2;
	}
	public double getDistance(){
		double distance;
		double dx,dy;
		dx=P2.getX()-P1.getX();
		dy=P2.getY()-P1.getY();
		distance=Math.sqrt(Math.pow(dx, 2)+(Math.pow(dy, 2)));
		return distance;
	}
	//Para el programa Pentágono2D. Es una forma de obtener el lado L basándome en el teorema de 
	//Pitágoras y en el uso de una variable auxiliar para llegar al objetivo
	public double getL() {
		double L=3.52;
		//a2, b2 y c2 son esas respectivas letras al cuadrado
		double a2,b2,c2;
		double operacion1;
		double apotema=L/1.45;
		
		a2=Math.pow(P1.getY(), 2);
		b2=Math.pow(L/2, 2);		
		c2=Math.pow(apotema, 2);
		
		operacion1= b2+c2;
		
		L= Math.sqrt(a2/operacion1); //Esto es L, aunque hemos tenido que ponerle su valor numérico al principio
		return L;
		}
	
	
	
}


		
		
	

