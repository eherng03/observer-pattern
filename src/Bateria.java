import java.util.Observable;

public class Bateria extends Observable{

	private boolean cargando;
	private int carga;
	private int tiempoRestante;
	private int unidadTiempo;		//Cantidad de tiempo que le corresponde a cada 1% de bateria
	
	public Bateria(){
		//Nuestra bateria durará 1000 minutos
		this.tiempoRestante = 1000;
		this.unidadTiempo = this.tiempoRestante/100;
	}

	public int getCarga() {
		return carga;
		
	}

	public void setCarga(int carga) {
		if(carga >= 0 && this.carga != carga && carga <= 100){
			this.carga = carga;
			this.tiempoRestante = carga*unidadTiempo;
			notifica();
		}
	}

	public int getTiempoRestante() {
		return tiempoRestante;
	}

	public void setTiempoRestante(int tiempo) {
		if(tiempo >= 0){
			this.tiempoRestante = tiempo;
			notifica();
		}
	}
	
	public boolean isCargando() {
		return cargando;
	}

	public void setCargando(boolean cargando) {
		this.cargando = cargando;
		notifica();
	}
	
	public void notifica(){
		setChanged();
		notifyObservers();
	}

	
}
