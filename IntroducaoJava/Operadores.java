package IntroducaoJava;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritimeticos: + | - | * | / |
        int number1 = 10;
        int number2 = 20;
        System.out.println("Valor:"+ (number1 + number2));

        // Operadores relacionais: % | < > | <= >= | == | != |
        int resto = 21%2;
        System.out.println(resto);

        // is____ <- Nome da variavel
        boolean isDezMaiorQueVinte = 10<20;
        System.out.println(isDezMaiorQueVinte);

        // Operadores Lógicos: && (AND) -  ||(or) - !
        int idade = 35;
        float salario =3500;
        boolean isIdadeDentroDaLei = idade > 30 && salario >= 4612;
        System.out.println(isIdadeDentroDaLei);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float playStation = 5500F;
        boolean isPlayStationCompravel = contaCorrente >= playStation || contaPoupanca >= playStation;
        System.out.println(isPlayStationCompravel);

        //Operadores atribuição: = | += | -= | *= | /= | %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        //
        int contador = 2;
        contador += 1;
        System.out.println(contador);
    }
}
