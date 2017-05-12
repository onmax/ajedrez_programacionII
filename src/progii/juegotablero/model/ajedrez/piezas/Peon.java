package progii.juegotablero.model.ajedrez.piezas;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

public class Peon extends PiezaAjedrez {
	
	public Peon(Jugador jugador, int x, int y) {
		super(jugador, TipoPiezaAjedrez.PEON, x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean puedeMover(int toX, int toY, boolean hayContrario) {
		// Comprueba si hay una ficha en las posiciones y+1, x+1 o y-1, x-1 si
		// la hay,
		// devuelve un true o false en relaccion, a si puede mover a y+1, x+1 o
		// a
		// y-1, x-1.
		if (super.puedeMover(toX + 1, toY + 1, hayContrario) == false
				&& super.puedeMover(toX - 1, toY - 1, hayContrario) == false) {
			return super.puedeMover(toX + 1, toY + 1, hayContrario) || super.puedeMover(toX + 1, toY - 1, hayContrario);

			// En caso de que esto no se cumpla, simplemente comprueba que la
			// pieza pueda mover hacia delante
		} else {
			return super.puedeMover(toX, toY, hayContrario) && (toY == this.getY() + 1 && this.getX() == toX);
		}
	}

}
