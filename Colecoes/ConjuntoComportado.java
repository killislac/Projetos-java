package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> Lista = new HashSet<String>();
        Lista.add("Kamily");
        Lista.add("JL");
        Lista.add("IT");

        for(String aprovados : Lista){
            System.out.println(aprovados);
        }
    }
}
