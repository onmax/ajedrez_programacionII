package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

<<<<<<< HEAD
/**
 * Clase que representa a la Reina
 * 
 * @author groman
 *
 */

public class Reina extends PiezaAjedrez {

	/**
	 * Crea una Reina pertenenciente a jugador en la posición (x,y) del tablero
	 * 
	 * @param jugador
	 *            El jugador al que pertenece la pieza
	 * @param x
	 *            Fila que ocupa
	 * @param y
	 *            Columna que ocupa
	 */
	public Reina(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.REINA, x, y);

	}

	/**
	 * Devuelve si la Reina puede mover a la posición (toX,toY) habiendo o no
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
=======
public class Reina extends PiezaAjedrez {

	public Reina(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.REINA, x, y);
	}

	/**
	/**
	 * Devuelve si la Reina puede mover a la posicion (toX,toY) habiendo o no contrario en dicha posiciÃ³n. 
	 * Se debe comprobar si el movimiento se sale del tablero y para ello se debe usar el mÃ©todo puedeMover de la 
	 * clase PiezaAjedrez.
	 * @param toX Fila destino del movimiento 
	 * @param toY Columna destino del movimiento
	 * @param hayContrario true si hay una pieza contraria en la posiciÃ³n (toX,toY)
	 * @return true si el movimiento es vÃ¡lido y false e.o.c.
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	 */
	
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
<<<<<<< HEAD
		return super.puedeMover(toX, toY, hayContrario) && ((this.getX() != toX && toY == getY())
				|| (toX - this.getX() == toY - this.getY() || this.getX() + this.getY() == toY + toX)
				|| (this.getY() != toY && toX == getX())
				|| (toX - this.getX() == toY - this.getY() || this.getX() + this.getY() == toY + toX));
=======
		return (super.puedeMover(toX, toY, hayContrario) && (this.getX() != toX && toY == getY())
				|| (this.getY() != toY && toX == getX()) || // Movimiento de la
															// torre
				(((this.getX() + this.getY()) % 2 == 0) && ((toX + toY) % 2 == 0) // Movimiento
																					// Alfil
						|| ((this.getX() + this.getY()) % 2 != 0) && (toX + toY) % 2 != 0));
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	}
}
