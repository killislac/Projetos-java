package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ka");
        fila.offer("KE");


        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.poll());
    }
}
