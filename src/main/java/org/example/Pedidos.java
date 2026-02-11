package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private String Id;
    private List<Productos> producto = new ArrayList<>();

    public Pedidos() {
    }

    public Pedidos(String id, List<Productos> producto) {
        Id = id;
        this.producto = producto;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<Productos> getProducto() {
        return producto;
    }

    public void setProducto(List<Productos> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "Id='" + Id + '\'' +
                ", producto=" + producto +
                '}';
    }

    public void aggproducto (Productos producto){
        this.producto.add(producto);
    }
    public void mostrardetalles (){
        for(Object pe: getProducto()){
            System.out.println(pe.toString());
        }

    }
}

