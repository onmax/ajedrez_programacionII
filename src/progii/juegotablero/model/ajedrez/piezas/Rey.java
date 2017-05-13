package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Rey
 * 
 * @author groman
 *
 */

public class Rey extends PiezaAjedrez {
/
	 * Crea un rey pertenenciente a jugador en la posicion (x,y) del tablero
	 * 
	 * @param jugador
	 *            El jugador al que pertenece la pieza
	 * @param x
	 *            Fila que ocupa
	 * @param y
	 *            Columna que ocupa
	 */
	public Rey(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.REY, x, y);

	}
	/**

	 * Devuelve si el Rey puede mover a la posicion (toX,toY) habiendo o no
	 * contrario en dicha posicion. Se debe comprobar si el movimiento se sale
	 * del tablero y para ello se debe usar el metodo puedeMover de la clase
	 * PiezaAjedrez.
	 * 
	 * @param toX
	 *            Fila destino del movimiento
	 * @param toY
	 *            Columna destino del movimiento
	 * @param hayContrario
	 *            true si hay una pieza contraria en la posición (toX,toY)
	 * @return true si el movimiento es válido y false e.o.c.

	 *            true si hay una pieza contraria en la posicion (toX,toY)
	
*/
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
		return (super.puedeMover(toX, toY, hayContrario)&&
				(toX == this.getX() + 1 || toX == this.getX() -1) ||
				(toY == this.getY()+1 || toY == this.getY()-1));
	}
}
