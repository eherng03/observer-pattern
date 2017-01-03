import java.util.Observable;
import java.util.Observer;
/**
 * Observador que indica tiempo restante de la bateria
 * @author Eva
 *
 */
public class Obs1 implements Observer{
	
	@Override
	public void update(Observable o, Object arg) {
		Bateria bat = (Bateria) o;
		System.out.println("El tiempo restante de la bateria es de " + bat.getTiempoRestante() + " minutos.");
	}
}
