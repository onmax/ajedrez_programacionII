package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Peon extends PiezaAjedrez {

	public Peon(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, tipoPieza.PEON, x, y);
		// TODO Auto-generated constructor stub
	}

}
