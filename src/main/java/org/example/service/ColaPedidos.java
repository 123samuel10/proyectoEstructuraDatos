package org.example.service;



import org.example.model.Pedido;

import java.util.LinkedList;
import java.util.Queue;
public class ColaPedidos {
    private Queue<Pedido> cola;

    public ColaPedidos() {
        cola = new LinkedList<>();
    }

    // Agregar un nuevo pedido
    public void agregarPedido(Pedido pedido) {
        cola.add(pedido);
        System.out.println("Pedido agregado: " + pedido);
    }

    // Atender el siguiente pedido
    public Pedido atenderPedido() {
        if (!cola.isEmpty()) {
            Pedido atendido = cola.poll();
            System.out.println("Pedido atendido: " + atendido);
            return atendido;
        } else {
            System.out.println("No hay pedidos en la cola.");
            return null;
        }
    }

    // Mostrar todos los pedidos en la cola
    public void mostrarPedidos() {
        if (cola.isEmpty()) {
            System.out.println("No hay pedidos en la cola.");
        } else {
            System.out.println("Pedidos en la cola:");
            for (Pedido pedido : cola) {
                System.out.println(pedido);
            }
        }
    }

    // Consultar el número de pedidos en la cola
    public int contarPedidos() {
        return cola.size();
    }
}
