package somosPNTEjercicio;

public class Menu {
	public static void  runMenu (){
		Supermercado supermercado = new Supermercado();
		supermercado.cargarProductos();
		supermercado.mostrarProductos();
		System.out.println("=================================================");
		supermercado.ordenarListaProductos();
		System.out.println("Producto mas caro: "+supermercado.mostrarProductoMasCaro());
		System.out.println("Producto mas barato: "+supermercado.mostrarProductoMasBarato());   
	}
}
