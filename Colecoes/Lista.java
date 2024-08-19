package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario u1 = new Usuario("ANA");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Jose"));

        for (Usuario u : lista){
            System.out.println(u.nome);
        }

    }
}
