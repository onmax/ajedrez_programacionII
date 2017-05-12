package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Peon
 * @author groman
 *
 */

<<<<<<< HEAD
public class Peon extends PiezaAjedrez  {

	/**
	 * Crea una Peon pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param x Fila que ocupa 
	 * @param y Columna que ocupa
	 */
	public Peon(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.PEON, x, y);
		
	}

	/**
	 * Devuelve si la Peon puede mover a la posición (toX,toY) habiendo o no contrario en dicha posición. 
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
				( (this.getX()!=toX && toY == getY()) || 
				  (this.getY()!= toY && toX == getX()) ); 
=======
	public Peon(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, tipoPieza.PEON, x, y);
		// TODO Auto-generated constructor stub
>>>>>>> 3ed4b9f4068432ff42d2026a67a19e214c889173
	}

}

