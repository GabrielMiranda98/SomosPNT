package somosPNTEjercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {
    private ArrayList<Producto>listaProductos = new ArrayList<Producto>();

	public void cargarProductos(){
        listaProductos.add(new Bebidas(1,"Coca-Cola Zero",20,1.5));
        listaProductos.add(new Bebidas(2,"Coca-Cola",18,1.5));
        listaProductos.add(new Perfumeria(1,"Shampoo Sedal",19,500));
        listaProductos.add(new Verduleria(1,"Frutillas",64));
    }
    public void mostrarProductos(){
        this.getListaProductos().forEach(System.out::println);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public void ordenarListaProductos(){
        Collections.sort(listaProductos);
    }
    public String mostrarProductoMasBarato(){
        final int PRIMERO=0;
        return this.getListaProductos().get(PRIMERO).getNombre();
    }
    
    public String mostrarProductoMasCaro(){
        final int ULTIMO = this.getListaProductos().size()-1;
        return this.getListaProductos().get(ULTIMO).getNombre();
    }
}

