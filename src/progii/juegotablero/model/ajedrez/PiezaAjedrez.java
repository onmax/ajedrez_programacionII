package progii.juegotablero.model.ajedrez;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Pieza;

/**
 * Clase que modela una pieza de ajedrez
 * @author groman
 *
 */
 class PiezaAjedrez extends Pieza {
	
	private TipoPiezaAjedrez tipoPieza; 
	
	public PiezaAjedrez (Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, x, y); 
		this.tipoPieza = tipoPieza;
	}

	public TipoPiezaAjedrez getTipoPieza() {
		return tipoPieza;
	}

		public boolean puedeMover(int x, int y, boolean hayC) {
		boolean puedeX = x<8 && x>=0;
		boolean puedeY = y<8 && y>=0;
		if(puedeX && puedeY){
			return true;
		}
		else{
			return false;
		}
	}
	 
	 //---------------Metodo Alternativo-----------------//
	 @Override
	public boolean puedeMover(int x, int y, boolean hayC) {
		 if (x >= 0 && x < 8 && y >= 0 && y < 8) {
			return true;
		} else {
			return false;
		}
	}
	public String toString(){
		return getTipoPieza() + "_" + getJugador().getNombre(); 
	}
	
}
