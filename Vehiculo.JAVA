package lab;

public class Vehiculo {
	private int puertas;
	public static int minimoPuertas;
	public final static int MINIMO_PUERTAS=1;
	public static int foo(){
		return 2;
		
	}
			public Vehiculo(int puertas){
				this.puertas=puertas;
				
			}
			public int getPuertas() {
				return puertas;
			}

			public void setPuertas(int puertas) {
				if(puertas >MINIMO_PUERTAS){
					this.puertas = puertas;
				}
			
			}
		
}
