package OO.composicao;

public class CursoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kamily");
        Aluno aluno2 = new Aluno("maria");
        Aluno aluno3 = new Aluno("Kevin");

        Curso cursoAluno1 = new Curso("Java Completo");
        Curso cursoAluno2 = new Curso("C#");
        Curso cursoAluno3 = new Curso("SQL");

        cursoAluno1.adicionarAlunos(aluno1);
        cursoAluno2.adicionarAlunos(aluno2);
        cursoAluno3.adicionarAlunos(aluno3);
        cursoAluno1.adicionarAlunos(aluno2);



        aluno1.adicionarCurso(cursoAluno3);
        aluno2.adicionarCurso(cursoAluno3 );
        aluno3.adicionarCurso(cursoAluno3);

        for(Aluno aluno : cursoAluno1.alunos){
            System.out.println("Meu nome é " + aluno.nome + " e estou matriculado no curso "  + cursoAluno1.nome);
        }
    }
}

