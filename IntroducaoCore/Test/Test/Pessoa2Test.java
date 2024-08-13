package IntroducaoCore.Test.Test;

import IntroducaoCore.DominioOrientacaoObjetos.Pessoa2;

public class Pessoa2Test {
    public static void main(String[] args) {
        Pessoa2 pessoa2 = new Pessoa2();
        pessoa2.nome = "Kevin";
        pessoa2.idade = 18;
        pessoa2.sexo = 'M';
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.sexo);
    }
}
