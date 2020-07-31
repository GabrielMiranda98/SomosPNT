package somosPNTEjercicio;

public class Verduleria extends Producto{
	/*
	 * En este caso la cantidad, la dejo como dato inicializado, ya que el ejercicio no solicita una unidad de tipo 'balanza' para pesar el producto
	 */
	public Verduleria(int id, String nombre, int precio) {
		super(id, nombre, precio, 0," /// Unidad de venta: kilo");
	}
	@Override
	public String toString() {
		return getNombre("Nombre: ")+" /// Precio: $"+getPrecio()+getMagnitudFisica();
	}

	
}
