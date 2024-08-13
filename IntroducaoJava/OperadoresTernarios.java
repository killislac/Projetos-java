package IntroducaoJava;

public class OperadoresTernarios {
    public static void main(String[] args) {
        // Doar se o salario > 5000
        double salario = 6000;
        String mensagemDoar = "SIM IREI DOAR!";
        String mensagemNaoDoar = "Nao irei doar";
        //OPERADOR TERNARIO: (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
