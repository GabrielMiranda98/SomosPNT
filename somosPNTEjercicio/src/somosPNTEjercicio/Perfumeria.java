package somosPNTEjercicio;


public class Perfumeria extends Producto{
	private int contenido;
	public Perfumeria(int id, String nombre, int precio, double cantidad) {
		super(id, nombre, precio, cantidad," /// Contenido: ");
		this.contenido=(int)cantidad;
	}
	
	public int getContenido() {
		return contenido;
	}

	@Override
	public String toString() {
		return getNombre("Nombre: ")+getMagnitudFisica()+contenido+"ml"+" /// Precio: $"+getPrecio();
	}
	
}
