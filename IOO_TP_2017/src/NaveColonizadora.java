

public class NaveColonizadora extends Nave {
	

	private int Tripulacion;
	public void AumentarNivel() {
	
	}
	
	public void TransladarProblacion(Planeta origen, Planeta destino) {
	
	}
	
	public void Colonizar(Planeta destino) {
	
	}


	public int getTripulacion() {
		return Tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		Tripulacion = tripulacion;
	}
	
	public NaveColonizadora(int demoraProduccion, Planeta destino,
			EstadoNave estado, int costo, int salud, Posicion pos) {
		super(demoraProduccion, destino, estado, costo, salud, pos);
		// TODO Auto-generated constructor stub
	}
}