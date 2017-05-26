import java.util.List;




public abstract class Planeta {
	

	private String Nombre;
	private int Poblacion;
	private int Produccion;
	private int Recursos;
	private List<Nave> Naves;
	private int CantTorretas;
	private int CantidadPersonas;
	private List<Torreta> Torretas;
	private int CantNaves;
	private Posicion Pos;
	
	public Planeta(String nombre){
		this.Nombre = nombre;
		
	}
	public abstract void CrearNave();
	
	public abstract void AumentarProduccion();
	
	public abstract void CrearTorreta();

	public String getNombre(){
		return this.Nombre;
		
	}
	
	public void setNombre(String nombre){
		this.Nombre = nombre;
	}
	
	public int getPoblacion() {
		return this.Poblacion;
	}

	public void setPoblacion(int poblacion) {
		Poblacion = poblacion;
	}

	public int getProduccion() {
		return this.Produccion;
	}

	public void setProduccion(int produccion) {
		this.Produccion = produccion;
	}

	public int getRecursos() {
		return this.Recursos;
	}

	public void setRecursos(int recursos) {
		Recursos = recursos;
	}

	public List<Nave> getNaves() {
		return this.Naves;
	}

	public void setNaves(List<Nave> naves) {
		this.Naves = naves;
	}

	public int getCantTorretas() {
		return this.CantTorretas;
	}

	public void setCantTorretas(int cantTorretas) {
		this.CantTorretas = cantTorretas;
	}

	public int getCantidadPersonas() {
		return this.CantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.CantidadPersonas = cantidadPersonas;
	}

	public List<Torreta> getTorretas() {
		return this.Torretas;
	}

	public void setTorretas(List<Torreta> torretas) {
		this.Torretas = torretas;
	}

	public int getCantNaves() {
		return this.CantNaves;
	}

	public void setCantNaves(int cantNaves) {
		this.CantNaves = cantNaves;
	}

	public Posicion getPos() {
		return Pos;
	}

	public void setPos(Posicion pos) {
		this.Pos = pos;
	}
	
	
	public Planeta(String nombre, int poblacion, int produccion, int recursos,
			List<Nave> naves, int cantTorretas, int cantidadPersonas,
			List<Torreta> torretas, int cantNaves, Posicion pos) {
		super();
		Nombre = nombre;
		Poblacion = poblacion;
		Produccion = produccion;
		Recursos = recursos;
		Naves = naves;
		CantTorretas = cantTorretas;
		CantidadPersonas = cantidadPersonas;
		Torretas = torretas;
		CantNaves = cantNaves;
		Pos = pos;
		
		
	}
}
