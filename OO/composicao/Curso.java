package OO.composicao;

import java.util.ArrayList;

public class Curso {
   final String nome;
    // o método também adiciona joao à lista de alunos do curso matematica
     final ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }
    void adicionarAlunos(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }


}
