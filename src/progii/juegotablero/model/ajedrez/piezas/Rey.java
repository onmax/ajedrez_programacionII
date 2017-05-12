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

<<<<<<< HEAD
public class Rey extends PiezaAjedrez {

	/**
	 * Crea una Rey pertenenciente a jugador en la posición (x,y) del tablero
=======

public class Rey extends PiezaAjedrez {

	/**
	 * Crea un rey pertenenciente a jugador en la posiciÃ³n (x,y) del tablero
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
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
<<<<<<< HEAD

=======
		// TODO Auto-generated constructor stub
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	}
	/**
<<<<<<< HEAD
	 * Devuelve si la Rey puede mover a la posición (toX,toY) habiendo o no
	 * contrario en dicha posición. Se debe comprobar si el movimiento se sale
	 * del tablero y para ello se debe usar el método puedeMover de la clase
=======
	 * Devuelve si el Rey puede mover a la posicion (toX,toY) habiendo o no
	 * contrario en dicha posicion. Se debe comprobar si el movimiento se sale
	 * del tablero y para ello se debe usar el metodo puedeMover de la clase
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	 * PiezaAjedrez.
	 * 
	 * @param toX
	 *            Fila destino del movimiento
	 * @param toY
	 *            Columna destino del movimiento
	 * @param hayContrario
<<<<<<< HEAD
	 *            true si hay una pieza contraria en la posición (toX,toY)
	 * @return true si el movimiento es válido y false e.o.c.
=======
	 *            true si hay una pieza contraria en la posicion (toX,toY)
	 * @return true si el movimiento es valido y false e.o.c.
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	 */

	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
<<<<<<< HEAD
		return super.puedeMover(toX, toY, hayContrario) && (((this.getX() + 1 == toX) || (this.getX() - 1 == toX))
				&& ((this.getY() + 1 == toY) || (this.getY() - 1 == toY))
				|| ((this.getX() + 1 == toX || this.getX() - 1 == toX) && (this.getY() == toY))
				|| ((this.getY() + 1 == toY || this.getY() - 1 == toY) && (this.getX() == toX)));
=======
		return (super.puedeMover(toX, toY, hayContrario)&&
				(toX == this.getX() + 1 || toX == this.getX() -1) ||
				(toY == this.getY()+1 || toY == this.getY()-1));
>>>>>>> bd894945139d1f48534e8e21e4415de5486da226
	}
}
