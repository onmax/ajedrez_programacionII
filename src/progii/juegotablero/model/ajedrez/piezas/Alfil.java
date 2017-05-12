package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Alfil
 * @author groman
 *
 */

<<<<<<< HEAD
public class Alfil extends PiezaAjedrez  {

	/**
	 * Crea una Alfil pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param x Fila que ocupa 
	 * @param y Columna que ocupa
	 */
	public Alfil(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.ALFIL, x, y);
		
	}

	/**
	 * Devuelve si la Alfil puede mover a la posición (toX,toY) habiendo o no contrario en dicha posición. 
	 * Se debe comprobar si el movimiento se sale del tablero y para ello se debe usar el método puedeMover de la 
	 * clase PiezaAjedrez.
	 * @param toX Fila destino del movimiento 
	 * @param toY Columna destino del movimiento
	 * @param hayContrario true si hay una pieza contraria en la posición (toX,toY)
	 * @return true si el movimiento es válido y false e.o.c.
	 */

	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
		return super.puedeMover(toX, toY, hayContrario) && 
				((this.getX() + 7 == toX) && (this.getY() + 7 == toY)); 
=======
	public Alfil(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, tipoPieza.ALFIL, x, y);
		// TODO Auto-generated constructor stub
>>>>>>> 3ed4b9f4068432ff42d2026a67a19e214c889173
	}

}

