package IntroducaoCore.Test.Test;

import IntroducaoCore.DominioOrientacaoObjetos.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // Pessoa se refere a uma variavel de referncia  que recebe o tipo estudante
        pessoa.nome = "KAMILY";
        pessoa.idade = 18;
        pessoa.sexo = 'F';
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
