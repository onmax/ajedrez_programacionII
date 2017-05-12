package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Caballo
 * 
 * @author groman
 *
 */

<<<<<<< HEAD
public class Caballo extends PiezaAjedrez {
=======
public class Caballo extends PiezaAjedrez  {
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226

	/**
	 * Crea una Caballo pertenenciente a jugador en la posición (x,y) del
	 * tablero
	 * 
	 * @param jugador
	 *            El jugador al que pertenece la pieza
	 * @param x
	 *            Fila que ocupa
	 * @param y
	 *            Columna que ocupa
	 */
	public Caballo(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.CABALLO, x, y);

	}

	/**
	 * Devuelve si la Caballo puede mover a la posición (toX,toY) habiendo o no
	 * contrario en dicha posición. Se debe comprobar si el movimiento se sale
	 * del tablero y para ello se debe usar el método puedeMover de la clase
	 * PiezaAjedrez.
	 * 
	 * @param toX
	 *            Fila destino del movimiento
	 * @param toY
	 *            Columna destino del movimiento
	 * @param hayContrario
	 *            true si hay una pieza contraria en la posición (toX,toY)
	 * @return true si el movimiento es válido y false e.o.c.
	 */

	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
		System.out.println(toX + " " + (getX() - 2));
<<<<<<< HEAD
		return super.puedeMover(toX, toY, hayContrario)
				&& ((this.getX() - 2 == toX) && ((this.getY() + 1 == toY) || (this.getY() - 1 == toY)))
				|| ((this.getX() + 2 == toX) && ((this.getY() + 1 == toY) || (this.getY() - 1 == toY)))
				|| ((this.getY() + 2 == toY) && ((this.getX() + 1 == toX) || (this.getX() - 1 == toX)))
				|| ((this.getY() - 2 == toY) && ((this.getX() + 1 == toX) || (this.getX() - 1 == toX)));
=======
		return super.puedeMover(toX, toY, hayContrario) &&
				((this.getX() - 2 == toX) && ((this.getY() + 1 == toY) || (this.getY() - 1 == toY))) ||
				((this.getX() + 2 == toX) && ((this.getY() + 1 == toY) || (this.getY() - 1 == toY))) ||
				((this.getY() + 2 == toY) && ((this.getX() + 1 == toX) || (this.getX() - 1 == toX))) ||
				((this.getY() - 2 == toY) && ((this.getX() + 1 == toX) || (this.getX() - 1 == toX)));
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	}
}
