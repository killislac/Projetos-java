package IntroducaoJava;

public class EXBreak {
    public static void main(String[] args) {

        double valorCarro = 40000;
        double parcela2 = valorCarro;


        for (int i = 1; parcela2 > 1000 ; i++) {
            parcela2 = valorCarro/i;
            System.out.println("Qtd parcelas:" + i);
            System.out.println("valor" + parcela2);


        }
    }
}
