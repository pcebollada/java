
public class Cubo {
	public static void main(String[] args){
		Punto3D a,b,c,d;
		Punto3D e,f,g,h;
		
		a= new Punto3D(0,0,0,'A');
		b= new Punto3D(4,0,0,'B');
		c= new Punto3D(4,0,4,'C');
		d= new Punto3D(0,0,4,'D');
		e= new Punto3D(0,4,4,'E');
		f= new Punto3D(4,4,4,'F');
		g= new Punto3D(4,4,0,'G');
		h= new Punto3D(0,4,0,'H');
		
		Segmento3D ab,ad,bc,cd;
		Segmento3D de,cf,bg,ah;
		Segmento3D  hg,he,ef,gh;
		
		
		ab= new Segmento3D(a,b);
		ad= new Segmento3D(a,d);
		bc= new Segmento3D(b,c);
		cd= new Segmento3D(c,d);
		de= new Segmento3D(d,e);
		cf= new Segmento3D(c,f);
		bg= new Segmento3D(b,g);
		ah= new Segmento3D(a,h);
		hg= new Segmento3D(h,g);
		he= new Segmento3D(h,e);
		ef= new Segmento3D(e,f);
		gh= new Segmento3D(g,h);
		
		
		
		System.out.println("Este cubo tiene un volumen (en centímetros cúbicos) de "+(cd.getDistancia1())*(cf.getDistancia2())*(bc.getDistancia3()));
		
		
	}
}
