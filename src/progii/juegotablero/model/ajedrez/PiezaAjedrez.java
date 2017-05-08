package progii.juegotablero.model.ajedrez;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Pieza;

/**
 * Clase que modela una pieza de ajedrez
 * @author groman
 *
 */
abstract class PiezaAjedrez extends Pieza {
	
	private TipoPiezaAjedrez tipoPieza; 
	
	public PiezaAjedrez (Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, x, y); 
		this.tipoPieza = tipoPieza;
	}

	public TipoPiezaAjedrez getTipoPieza() {
		return tipoPieza;
	}

	abstract public boolean puedeMover(int x, int y, boolean hayC);

	public String toString(){
		return getTipoPieza() + "_" + getJugador().getNombre(); 
	}
	
}
