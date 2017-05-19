package progii.juegotablero.model;

import anotacion.Programacion2;
import progii.juegotablero.exceptions.MovimientoException;
import progii.juegotablero.model.Movimiento;
import stacks.EmptyStackException;
import stacks.Stack;
@Programacion2 (
nombreAutor1 = "Maximo",
apellidoAutor1 = "García Martínez",
emailUPMAutor1 = "maximo.garcia.martinez@alumnos.upm.es",
nombreAutor2 = "Javier",
apellidoAutor2 = "Barragán Haro",
emailUPMAutor2 = "javier.barragan.haro@alumnos.upm.es"
)
public class GestorHistorial {
	private Stack<Movimiento> pilaDeshacer;
	private Stack<Movimiento> pilaRehacer;

	public GestorHistorial() {
		pilaDeshacer = new Stack<Movimiento>();
		pilaRehacer = new Stack<Movimiento>();
	}

	public void guardarMovimiento(Movimiento x) {
		pilaDeshacer.push(x);
		if (!pilaRehacer.isEmpty()) {
			pilaRehacer.makeEmpty();
		}
	}

	public Movimiento deshacer() throws MovimientoException {
		if (pilaDeshacer.isEmpty()) {
			throw new MovimientoException("No se puede deshacer \n porque no hay movimientos para deshacer");
		} else {
			Movimiento mov = null;
			try {
				mov = pilaDeshacer.peek();
				pilaRehacer.push(mov);
				pilaDeshacer.pop();
			} catch (EmptyStackException e) {
			}
			return mov;
		}
	}

	public Movimiento rehacer() throws MovimientoException {
		if (pilaRehacer.isEmpty()) {
			throw new MovimientoException("No se puede deshacer \n porque no hay movimientos para deshacer");
		} else {
			Movimiento mov = null;
			try {
				mov = pilaRehacer.peek();
				pilaDeshacer.push(mov);
				pilaRehacer.pop();
			} catch (EmptyStackException e) {
			}
			return mov;
		}
	}
}
