package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class TestIntegridadGestorHistorial {

	private static Class<?> clazz; 
	private static ArrayList<Atributo> atributos = new ArrayList<Atributo>();
	private static ArrayList<Metodo> constructores = new ArrayList<Metodo>(); 
	private static ArrayList<Metodo> metodos = new ArrayList<Metodo>(); 

	private static final String PKG = "progii.juegotablero.model.";
	private static final String CLAZZ = PKG + "GestorHistorial";
	

	@Rule //Se establece un time out general para todos los tests. Se debe comentar esta línea y la de abajo para depurar
	public TestRule  globalTimeout = new DisableOnDebug(Timeout.millis(100)); // 100 milisegundos máximos por test

	@BeforeClass
	public static void setup () {
		
		try {
			clazz = Class.forName(CLAZZ);
		} catch (ClassNotFoundException e) {
			fail("No se ha encontrado la clase '" + CLAZZ + "': No se continúa con el resto de tests."); 
		} 
		
		atributos.add(new Atributo("pilaDeshacer","stacks.Stack")); 
		atributos.add(new Atributo("pilaRehacer","stacks.Stack"));
		
		metodos.add(new Metodo ("deshacer", PKG + "Movimiento", new String [] {}));
		metodos.add(new Metodo ("rehacer", PKG + "Movimiento", new String [] {}));
		metodos.add(new Metodo ("guardarMovimiento", "void", new String [] {PKG + "Movimiento"})); 
		 
		constructores.add(new Metodo (null,null, new String [] {})); 
		
	}
	

	@Test
	public void testConstructores () {
		for (int i = 0; i<constructores.size(); i++){
			testConstructor(constructores.get(i)); 
		}

	}

	@Test
	public void testMetodos () {
		for (int i = 0; i<metodos.size(); i++){
			testMetodo(metodos.get(i)); 
		}

	}

	@Test 
	public void testAtributos () {
		for (int i = 0; i<atributos.size(); i++){
			testAtributo(atributos.get(i)); 
		}
	}

	private void testConstructor(Metodo constructor) {
		try {
			clazz.getDeclaredConstructor(constructor.getParametrosReflect());
			
		} catch (IllegalArgumentException e) {
			fail("No se ha podido acceder al constructor " + constructor + " en la clase " + clazz);
		} catch (NoSuchMethodException e) {
			fail("No se ha encontrado el constructor " + constructor+ " en la clase " + clazz); 
		} catch (SecurityException e) {
			fail("No se ha podido acceder al constructor " + constructor+ " en la clase " + clazz);
		}
	}
	
	private void testMetodo (Metodo metodo) {
		Method method =null;
		try {
			method = clazz.getDeclaredMethod(metodo.getNombre(),metodo.getParametrosReflect());
			
			assertTrue("Se ha encontrado el metodo " + metodo.getNombre() + " pero no coincide el tipo devuelto esperado (" + metodo.getTipoDevuelto()+")" + method.getReturnType().getName(),
					metodo.getTipoDevueltoConvertido().equals(method.getReturnType().getName())); 
				
		} catch (IllegalArgumentException e) {
			fail("No se ha podido acceder al método " + metodo + " en la clase " + clazz);
		} catch (NoSuchMethodException e) {
			fail("No se ha encontrado el método " + metodo+ " en la clase " + clazz); 
		} catch (SecurityException e) {
			fail("No se ha podido acceder al método " + metodo+ " en la clase " + clazz);
		}
	}

	private void testAtributo (Atributo atributo) {
		Field field=null;
		try {
			field = clazz.getDeclaredField(atributo.getNombre());
			
			if (!atributo.getTipoConvertido().equals(field.getType().getName())) {
				fail("Se ha encontrado el atributo " + atributo.getNombre() + " pero no coincide el tipo esperado (" + atributo.getTipo()+")"); 
			}
			
		} catch (IllegalArgumentException e) {
			fail("No se ha podido acceder al atributo " + atributo + " en la clase " + clazz);
		} catch (NoSuchFieldException e) {
			fail("No se ha encontrado el atributo " + atributo + " en la clase " + clazz); 
		} catch (SecurityException e) {
			fail("No se ha podido acceder al atributo " + atributo + " en la clase " + clazz);
		}
	}

	static class Miembro {
		private String nombre;
		
		public Miembro (String nombre) {
			this.nombre= nombre; 
		}
		
		public String getNombre () {
			return nombre; 
		}
	}
	
	static class Atributo extends Miembro {
		
		private String tipo;

		public Atributo(String nombre, String tipo) {
			super(nombre);
			this.tipo = tipo;
		}
		
		public String getTipo () {
			return tipo; 
		}
		
		public String getTipoConvertido() {
			return convertirTipo(this.tipo);
		} 

		@Override
		public String toString() {
			return "<" + tipo + " " + getNombre() + ">";   
		}
	}

	static class Metodo extends Miembro {
		private String tipoDevuelto; 
		private String [] parametros;
		private String [] parametrosConvertidos;
		
		
		public Metodo(String nombre, String tipoDevuelto, String[] parametros) {
			super(nombre);
			this.tipoDevuelto = tipoDevuelto;
			this.parametros = parametros;
			parametrosConvertidos = new String [parametros.length]; 
			for (int i = 0; i < parametros.length; i ++){
				parametrosConvertidos [i] = convertirTipo(parametros[i]); 
			}
		}

		public String getTipoDevueltoConvertido() {
			return convertirTipo(tipoDevuelto);
		}

		public String getTipoDevuelto() {
			return tipoDevuelto;
		}

		public Class<?>[] getParametrosReflect() {
			Class<?> [] params = new Class[parametros.length]; 
			
			for (int i = 0; i < parametros.length; i++){
				try {
					params[i] = getClazz(parametros[i]); 
				} catch (ClassNotFoundException e) {
					fail("Error al comparar la clase del parámetro de " + params[i] + ". Pongase en contacto con el profesor"); 
				} 
			}
			
			return params;
			
		} 

		public String[] getParametros() {
			return parametros;
		} 
		
		@Override
		public String toString() {
			String res = "--" + tipoDevuelto + " " + getNombre() + "(";
			for (int i = 0; i < parametros.length-1; i++)  {
				res += parametros[i] + ",";
			}
			if (parametros.length > 0) {
				res += parametros[parametros.length-1] + ")--";
			}
			return res;
		}
	}
	
	private static String convertirTipo (String tipo) {
		if (tipo.endsWith("[]")){
			return "[" + getTipo(tipo.substring(0,tipo.length()-2)); 
		}
		else {
			return tipo;
		}
	}
	
	private static String getTipo (String tipo) {
		if (tipo.equals("int")) return "I"; 
		else if (tipo.equals("long")) return "J"; 
		else if (tipo.equals("float")) return "F"; 
		else if (tipo.equals("double")) return "D"; 
		else if (tipo.equals("char")) return "C"; 
		else if (tipo.equals("byte")) return "B"; 
		else if (tipo.equals("void")) return "V";
		else return "L" + tipo + ";"; 
		
	}
	
	private static Class<?> getClazz (String tipo) throws ClassNotFoundException {
		if (tipo.equals("int")) return Integer.TYPE; 
		else if (tipo.equals("float")) return Float.TYPE; 
		else if (tipo.equals("double")) return Double.TYPE; 
		else if (tipo.equals("long")) return Long.TYPE; 
		else if (tipo.equals("char")) return Character.TYPE; 
		else if (tipo.equals("byte")) return Byte.TYPE; 
		else if (tipo.endsWith("[]")) return Class.forName("["+getTipo(tipo.substring(0, tipo.length()-2))); 
		
		else return Class.forName(tipo);
	}
	
	
}

