//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Nave.java
//  @ Date : 17/05/2017
//  @ Author : 
//
//




public abstract class Nave {
	

	private int DemoraProduccion;
	private Planeta Destino;
	private EstadoNave Estado;
	private int Costo;
	private int Salud;
	private Posicion Pos;
	public void viajarA(Object Planeta) {
	
	}
	
	public void AumentarNivel() {
	
	}

	public int getDemoraProduccion() {
		return DemoraProduccion;
	}

	public void setDemoraProduccion(int demoraProduccion) {
		DemoraProduccion = demoraProduccion;
	}

	public Planeta getDestino() {
		return Destino;
	}

	public void setDestino(Planeta destino) {
		Destino = destino;
	}

	public EstadoNave getEstado() {
		return Estado;
	}

	public void setEstado(EstadoNave estado) {
		Estado = estado;
	}

	public int getCosto() {
		return Costo;
	}

	public void setCosto(int costo) {
		Costo = costo;
	}

	public int getSalud() {
		return Salud;
	}

	public void setSalud(int salud) {
		Salud = salud;
	}

	public Posicion getPos() {
		return Pos;
	}

	public void setPos(Posicion pos) {
		Pos = pos;
	}
	
	//Constructor 
	public Nave(int demoraProduccion, Planeta destino, EstadoNave estado,
			int costo, int salud, Posicion pos) {
		super();
		DemoraProduccion = demoraProduccion;
		Destino = destino;
		Estado = estado;
		Costo = costo;
		Salud = salud;
		Pos = pos;
	}
}
