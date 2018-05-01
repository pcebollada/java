
public class ManejaSegmento {
	public static void main(String[] args){
		Punto a,b,c,d;
		Segmento ab;
		SegmentoColoreado cd;
		a= new Punto (2,3,'A');
		b= new Punto (3,1,'B');
		ab= new Segmento (a,b);
		
		c=new Punto (2,3,'C');
		d=new Punto (3,1,'D');
		cd= new SegmentoColoreado(c,d, "Amarillo");
		
		System.out.println("El segmento tiene una longitud de "+ab.getDistance());
		System.out.println("El segmento es de color "+cd.getColor());
		
		
	}
}
