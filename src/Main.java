
public class Main {
	
	public static void main(String[] args){

		Bateria bat = new Bateria();
		Obs1 obsTiempo = new Obs1();
		Obs2 obsBateria = new Obs2();
		
		bat.addObserver(obsBateria);
		bat.addObserver(obsTiempo);
		
		bat.setCarga(100);
	}
}
