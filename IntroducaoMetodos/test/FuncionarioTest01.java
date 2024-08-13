package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.nome = "Kamily";
        funcionarios.idade = 18;
        funcionarios.salario = new double[]{1200, 1300, 1400};

        funcionarios.imprime();


    }

}
