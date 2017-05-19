package progii.juegotablero.model.ajedrez;

import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Pieza;
import anotacion.Programacion2;
@Programacion2 (
nombreAutor1 = "Maximo",
apellidoAutor1 = "García Martínez",
emailUPMAutor1 = "maximo.garcia.martinez@alumnos.upm.es",
nombreAutor2 = "Javier",
apellidoAutor2 = "Barragán Haro",
emailUPMAutor2 = "javier.barragan.haro@alumnos.upm.es"
)
/**
 * Clase que modela una pieza de ajedrez
 * 
 * @author groman
 *
 */
public class PiezaAjedrez extends Pieza {

	private TipoPiezaAjedrez tipoPieza;

	public PiezaAjedrez(Jugador jugador, TipoPiezaAjedrez tipoPieza, int x, int y) {
		super(jugador, x, y);
		this.tipoPieza = tipoPieza;
	}

	public TipoPiezaAjedrez getTipoPieza() {
		return tipoPieza;
	}

	public boolean puedeMover(int x, int y, boolean hayC){
		boolean puedeX = x < 8 && x >= 0;
		boolean puedeY = y < 8 && y >= 0;
		if(x == getX() && y == getY()){
			return false;
		} else if(puedeX && puedeY){
			return true;
		}else{
			return false;
		}
	}

	public String toString() {
		return getTipoPieza() + "_" + getJugador().getNombre();
	}

}
