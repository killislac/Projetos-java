package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto  =  new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é" + conjunto.size()); // tamanho dos elementos no conjunto
        System.out.println(conjunto.remove("Teste")); // Remove o conjunto que contem o "TESTE"
        System.out.println(conjunto.contains('x'));// Verifica se ha no conjunto


        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); // Juntar tudo




    }
}
