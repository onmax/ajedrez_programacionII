package progii.juegotablero.model.ajedrez.piezas;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

<<<<<<< HEAD
/**
 * Clase que representa a la Peon
 * @author groman
 *
 */

public class Peon extends PiezaAjedrez  {

	/**
	 * Crea una Peon pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param x Fila que ocupa 
	 * @param y Columna que ocupa
	 */
=======
public class Peon extends PiezaAjedrez {
	
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	public Peon(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.PEON, x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
<<<<<<< HEAD
		boolean negro = this.getJugador().getId() == ControlJugadoresAjedrez.NEGRO;
		if(negro){
			if(this.getX() == 1){
				return super.puedeMover(toX, toY, hayContrario) && (((this.getX() + 2) == toX || (this.getX() + 1)== toX) && this.getY() == toY && !hayContrario) || hayContrario && (this.getX() + 1 == toX && ((this.getY() + 1 == toY)||(this.getY() - 1 == toY))); 
			}else{
				return super.puedeMover(toX, toY, hayContrario) && (((this.getX() + 1)== toX) && this.getY() == toY && !hayContrario) || hayContrario && (this.getX() + 1 == toX && ((this.getY() + 1 == toY)||(this.getY() - 1 == toY))); 
			}
		}else{
			if(this.getX() == 6){
				return super.puedeMover(toX, toY, hayContrario) && (((this.getX() - 2) == toX || (this.getX() - 1)== toX) && this.getY() == toY && !hayContrario) || hayContrario && (this.getX() - 1 == toX && ((this.getY() + 1 == toY)||(this.getY() - 1 == toY))); 
			}else{
				return super.puedeMover(toX, toY, hayContrario) && (((this.getX() - 1)== toX) && this.getY() == toY && !hayContrario) || hayContrario && (this.getX() - 1 == toX && ((this.getY() + 1 == toY)||(this.getY() - 1 == toY))); 
			}
=======
		// Comprueba si hay una ficha en las posiciones y+1, x+1 o y-1, x-1 si
		// la hay,
		// devuelve un true o false en relaccion, a si puede mover a y+1, x+1 o
		// a
		// y-1, x-1.
		if (super.puedeMover(toX + 1, toY + 1, hayContrario) == false
				&& super.puedeMover(toX - 1, toY - 1, hayContrario) == false) {
			return super.puedeMover(toX + 1, toY + 1, hayContrario) || super.puedeMover(toX + 1, toY - 1, hayContrario);

			// En caso de que esto no se cumpla, simplemente comprueba que la
			// pieza pueda mover hacia delante
		} else {
			return super.puedeMover(toX, toY, hayContrario) && (toY == this.getY() + 1 && this.getX() == toX);
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
		}
	}

}
