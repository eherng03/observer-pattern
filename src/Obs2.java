import java.util.Observable;
import java.util.Observer;
/**
 * Observador que indica tanto por ciento de carga
 * @author Eva
 *
 */
public class Obs2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		Bateria bat = (Bateria) o;
		if(bat.getCarga() > 0){
			System.out.println("Queda un " + bat.getCarga() + "% de bateria.");
			bat.setCarga(bat.getCarga() - 10);
			
		}else{
			System.out.println("Queda un " + bat.getCarga() + "% de bateria.");	
			
		}	
	}
}
