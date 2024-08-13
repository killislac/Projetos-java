package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.Estudante;
import IntroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "kevin";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "kevin";
        estudante02.idade = 18;
        estudante02.sexo = 'M';
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
