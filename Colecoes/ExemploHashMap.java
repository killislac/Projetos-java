package Colecoes;
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Alice", 30);
        mapa.put("Bob", 25);
        mapa.put("Carlos", 35);

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        System.out.println(mapa.entrySet());
        System.out.println("Idade de Alice: " + mapa.get("Alice"));

        System.out.println("Pares chave-valor do mapa:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            String chave = entrada.getKey();
            Integer valor = entrada.getValue();
            System.out.println(chave + ": " + valor);
        }
    }
}