package OO.composicao;

import java.util.ArrayList;

public class Aluno {
   final String nome;

    // o método adiciona o curso de Matemática (matematica) à lista de cursos de joao
  final  ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
    this.nome = nome;
}
    //  joao.adicionarCurso(matematica);
    void adicionarCurso (Curso curso){
       // Agora, joao.cursos inclui matematica.
        this.cursos.add(curso);

       // matematica.alunos: inclui joao.
        curso.alunos.add(this);
    }
}

