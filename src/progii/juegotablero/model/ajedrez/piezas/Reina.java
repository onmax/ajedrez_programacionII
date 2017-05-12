package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Reina extends PiezaAjedrez {

	@SuppressWarnings("static-access")
	public Reina(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, tipoPieza.REINA, x, y);
	}
	/**
	 * Devuelve si la Reina puede mover a la posicion (toX,toY) habiendo o no contrario en dicha posiciÃ³n. 
	 * Se debe comprobar si el movimiento se sale del tablero y para ello se debe usar el mÃ©todo puedeMover de la 
	 * clase PiezaAjedrez.
	 * @param toX Fila destino del movimiento 
	 * @param toY Columna destino del movimiento
	 * @param hayContrario true si hay una pieza contraria en la posiciÃ³n (toX,toY)
	 * @return true si el movimiento es vÃ¡lido y false e.o.c.
	 */
	
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
		return (super.puedeMover(toX, toY, hayContrario) && (this.getX() != toX && toY == getY())
				|| (this.getY() != toY && toX == getX()) || // Movimiento de la
															// torre
				(((this.getX() + this.getY()) % 2 == 0) && ((toX + toY) % 2 == 0) // Movimiento
																					// Alfil
						|| ((this.getX() + this.getY()) % 2 != 0) && (toX + toY) % 2 != 0));
	}
}
