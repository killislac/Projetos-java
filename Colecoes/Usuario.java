package Colecoes;

import java.util.Objects;

public class
Usuario {
    String nome;
 Usuario(String nome){
     this.nome = nome;
 }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
