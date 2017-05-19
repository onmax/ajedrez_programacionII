package progii.juegotablero.model.ajedrez.piezas;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
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
 * Clase que representa a la Peon
 * @author groman
 *
 */

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
		boolean negro = this.getJugador().getId() == ControlJugadoresAjedrez.NEGRO;
		boolean puede = super.puedeMover(toX, toY, hayContrario);
		if(negro){
			if(this.getX() == 1){
				return puede && (((getX()+1 == toX)||(getX()+2 == toX)) && getY() == toY && !hayContrario) || (hayContrario && (getX() + 1 == toX) && ((getY()-1==toY)||(getY() + 1==toY)));
			}else{
				return puede && ((getX()+1 == toX) && getY() == toY && !hayContrario) || (hayContrario && (getX() + 1 == toX) && ((getY()-1==toY)||(getY() + 1==toY)));
			}
		}else{
			if(this.getX() == 6){
				return puede && (((getX()-1 == toX)||(getX()-2 == toX)) && getY() == toY && !hayContrario) || (hayContrario && (getX() - 1 == toX) && ((getY()-1==toY)||(getY() + 1==toY)));
			}else{
				return puede && ((getX()-1 == toX) && getY() == toY && !hayContrario) || (hayContrario && (getX() - 1 == toX) && ((getY()-1==toY)||(getY() + 1==toY)));
			}
		}
	}

}
