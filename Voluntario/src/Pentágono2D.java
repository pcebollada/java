
public class Pentágono2D {
	public static void main(String[] args) {
		//Establecemos dos puntos cualesquiera que serán el lado del pentágono
		Punto2D a,b,O;
		a= new Punto2D (0,3, 'A');
		b= new Punto2D (-3,0,'B');
		O= new Punto2D (0,0,'O');
		
		Segmento2D L; //Su respectiva preparación está en Segmento2D
		
		System.out.println("El área de este pentágono es de "+ÁreaPentágono2D.getArea()+" centímetros cuadrados");
		
		
		
	}

}
