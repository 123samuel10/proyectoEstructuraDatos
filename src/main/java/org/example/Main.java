package org.example;

import org.example.model.Pedido;
import org.example.service.ColaPedidos;

public class Main {
    public static void main(String[] args) {
        ColaPedidos colaPedidos = new ColaPedidos();

        // Crear pedidos
        Pedido pedido1 = new Pedido(1, "Ana", "Hamburguesa, Papas", "En espera");
        Pedido pedido2 = new Pedido(2, "Luis", "Pizza", "En espera");
        Pedido pedido3 = new Pedido(3, "María", "Ensalada, Refresco", "En espera");

        // Agregar pedidos a la cola
        colaPedidos.agregarPedido(pedido1);
        colaPedidos.agregarPedido(pedido2);
        colaPedidos.agregarPedido(pedido3);

        // Mostrar pedidos en la cola
        colaPedidos.mostrarPedidos();

        // Atender el siguiente pedido
        colaPedidos.atenderPedido();

        // Mostrar pedidos nuevamente
        colaPedidos.mostrarPedidos();

        // Consultar el número de pedidos restantes
        System.out.println("Pedidos restantes en la cola: " + colaPedidos.contarPedidos());
    }
}