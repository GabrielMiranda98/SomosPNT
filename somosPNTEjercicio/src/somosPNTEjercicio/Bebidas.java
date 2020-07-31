package somosPNTEjercicio;

public class Bebidas extends Producto{

	public Bebidas(int id, String nombre, int precio, double cantidad) {
		super(id, nombre, precio, cantidad," /// Litros: ");

	}

	@Override
	public String toString() {
		return getNombre("Nombre: ")+getMagnitudFisica()+getCantidad()+" /// Precio: $"+getPrecio();
		}
}