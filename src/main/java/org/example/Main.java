package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Productos> lstvacia = new ArrayList<>();

        Productos p1 = new Productos("Lentes", "40000", "22");
        Productos p2 = new Productos("Zapatos", "100000", "58");
        Productos p3 = new Productos("audifonos", "50000", "78");

        Pedidos pe1 = new Pedidos("01", lstvacia);
        Pedidos pe2 = new Pedidos("02", lstvacia);
        Pedidos pe3 = new Pedidos("03", lstvacia);

        pe1.aggproducto(p1);
        pe1.aggproducto(p2);
        pe1.aggproducto(p3);

        System.out.println(pe1.toString());
        pe1.mostrardetalles();


    }
}