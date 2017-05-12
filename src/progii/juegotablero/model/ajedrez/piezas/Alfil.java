package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

/**
 * Clase que representa a la Alfil
 * 
 * @author groman
 *
 */

<<<<<<< HEAD
public class Alfil extends PiezaAjedrez {
=======
public class Alfil extends PiezaAjedrez  {
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226

	/**
	 * Crea una Alfil pertenenciente a jugador en la posición (x,y) del tablero
	 * 
	 * @param jugador
	 *            El jugador al que pertenece la pieza
	 * @param x
	 *            Fila que ocupa
	 * @param y
	 *            Columna que ocupa
	 */
	public Alfil(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.ALFIL, x, y);

	}

	/**
	 * Devuelve si la Alfil puede mover a la posición (toX,toY) habiendo o no
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

	/**
	 * Devuelve si el Alfil puede mover a la posicion (toX,toY) habiendo o no contrario en dicha posicion. 
	 * Se debe comprobar si el movimiento se sale del tablero y para ello se debe usar el metodo puedeMover de la 
	 * clase PiezaAjedrez.
	 * @param toX Fila destino del movimiento 
	 * @param toY Columna destino del movimiento
	 * @param hayContrario true si hay una pieza contraria en la posicion (toX,toY)
	 * @return true si el movimiento es valido y false e.o.c.
	 */

	//Se suma la x y la y, si es par el alfil esta en la casilla blanca, si no esta en la negra.
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
<<<<<<< HEAD
		return super.puedeMover(toX, toY, hayContrario)
				&& ((toX - this.getX() == toY - this.getY() || this.getX() + this.getY() == toY + toX));
	}
=======
		return (super.puedeMover(toX, toY, hayContrario) &&( 
				((this.getX() + this.getY())% 2 ==  0) && ((toX+toY)%2 == 0) //ALFIL BLANCO
				||((this.getX()+this.getY())%2!=0) && (toX+toY)%2!=0 )); //ALFIL BLAMCO
	}
	
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
}
