
public class Cuadrado {
	public static void main(String[] args){
		Punto2D a,b,c,d;
		Segmento2D ad,ab,bc,cd;
		a=new Punto2D (0,4,'A');
		b=new Punto2D (4,4,'B');
		c=new Punto2D (4,0,'C');
		d=new Punto2D (0,0,'D');
		
		ad= new Segmento2D (a,d);
		ab= new Segmento2D (a,b);
		bc= new Segmento2D (b,c);
		cd= new Segmento2D (c,d);
	
		System.out.println("El cuadrado tiene un área de "+Math.pow(ab.getDistance(), 2)+" centímetros cuadrados");
		
	}
}
