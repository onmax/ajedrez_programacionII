package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Reina extends PiezaAjedrez {

	public Reina(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, tipoPieza.REINA, x, y);

	}

}
