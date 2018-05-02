
public class ÁreaPentágono2D {
	public static double getArea() {
		double Perimetro,Area;
		double L=3.52; //En esta clase ya conocemos el valor exacto del lado y lo expresamos
		double apotema=L/1.45;
		Perimetro=5*L;
		Area=Perimetro*apotema/2;
		return Area;
	}

}
