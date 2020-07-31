package somosPNTEjercicio;

public abstract class Producto implements Comparable<Producto> {
	private int id;
	private String nombre;
	private int precio;
	private double cantidad;
	private String magnitudFisica;
	public Producto(int id, String nombre, int precio, double cantidad,String magnitudFisica) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.magnitudFisica= magnitudFisica;
	}
	public String getMagnitudFisica() {
		return magnitudFisica;
	}
	public void setMagnitudFisica(String magnitudFisica) {
		this.magnitudFisica = magnitudFisica;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNombre(String principioParrafó) {
		return principioParrafó+nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "\nNombre:" + nombre + "\nPrecio:" + precio
				+ "\nCantidad:" + cantidad;
	}
    @Override
    public int compareTo(Producto producto){
        final int MAYOR=1;
        final int IGUAL=0;
        final int MENOR=-1;
        if(this.precio > producto.precio ){
            return MAYOR;
        }else if(this.precio == producto.precio){
            return IGUAL;
        }else{
            return MENOR;
        }
    }
}
