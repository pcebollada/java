
public class Colegio extends Edificio{
	private int numeroAulas;
	private boolean pabellon;
	//Colegio estaba en rojo porque la herencia estaba mal.
		//Le hemos dicho que para construir un colegio, teniamos que tener una dirección, un codigo Postal, una altura... que no habíamos definido antes
		public Colegio(String direccion, int codigoPostal,int altura, boolean calefaccionCentral, int numeroAulas, boolean pabellon) {
			super(direccion, codigoPostal, altura, calefaccionCentral);
			this.numeroAulas=numeroAulas;
			this.pabellon=pabellon;
					}
		public int getNumeroAulas() {
			return numeroAulas;
		}
		public void setNumeroAulas(int numeroAulas) {
			this.numeroAulas = numeroAulas;
		}
		public boolean isPabellon() {
			return pabellon;
		}
		public void setPabellon(boolean pabellon) {
			this.pabellon = pabellon;
		}
		public int getCapacidadColegio(){
			int capacidadColegio; 
			capacidadColegio= numeroAulas * 30;
			return(capacidadColegio);
		}
	
}
