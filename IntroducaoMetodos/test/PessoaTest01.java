package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("ana");
        pessoa.setIdade(13);
        System.out.println(pessoa.getNome());
    }
}
