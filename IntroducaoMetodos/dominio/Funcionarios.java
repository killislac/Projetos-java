package IntroducaoMetodos.dominio;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salario){
            System.out.println(salario);
        }
        mediaSalarios();
    }
    public void mediaSalarios (){
        double media = 0;
        for(double salario: salario){
            media += salario;

        }
        media /= salario.length;
        System.out.println(media);
    }
}
