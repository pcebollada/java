
public class Segmento3D {
	private Punto3D P1;
	private Punto3D P2;
	
	public Segmento3D(Punto3D p1, Punto3D p2) {
	P1=p1;
	P2=p2;
	}
	public Punto3D getP1() {
		return P1;
	}
	public void setP1(Punto3D p1) {
		P1 = p1;
	}
	public Punto3D getP2() {
		return P2;
	}
	public void setP2(Punto3D p2) {
		P2 = p2;
	}
	
	//Para el cubo
	public double getDistancia1() {
		double distancia1;
		double dx,dy,dz;
		dx=P2.getX()-P1.getX();
		dy=P2.getY()-P1.getY();
		dz=P2.getZ()-P1.getZ();
		distancia1=Math.sqrt(Math.pow(dx, 2)+(Math.pow(dy, 2))+(Math.pow(dz, 2)));
		return distancia1;
	}
	public double getDistancia2() {
		//Anchura
		double distancia2;
		double dx2,dy2,dz2;
		dx2=P2.getX()-P1.getX();
		dy2=P2.getY()-P1.getY();
		dz2=P2.getZ()-P1.getZ();
		distancia2=Math.sqrt(Math.pow(dx2, 2)+(Math.pow(dy2, 2))+(Math.pow(dz2, 2)));
		return distancia2;
		}
	public double getDistancia3() {
			double distancia3;
			double dx3,dy3,dz3;
			dx3=P2.getX()-P1.getX();
			dy3=P2.getY()-P1.getY();
			dz3=P2.getZ()-P1.getZ();
			distancia3=Math.sqrt(Math.pow(dx3, 2)+(Math.pow(dy3, 2))+(Math.pow(dz3, 2)));
			return distancia3;
		}
	
}
	