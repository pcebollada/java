
public class ManejaSegmento {
	public static void main(String[] args){
		Punto a,b;
		Segmento ab;
		a= new Punto (2,3,'A');
		b= new Punto (3,1,'B');
		ab= new Segmento (a,b);
		System.out.println("El segmento tiene una longitud de "+ab.getDistance());
		
		
		
	}
}
