package IntroducaoJava;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // TIPOS PRMITIVOS: int, double, float,char,byte,short,long,boolean
        // Para se criar uma variavel é necessario colocar primeiro o tipo depois o nome da variavel.
        int idade = 10;
        System.out.println("Essa pessoa tem:" + idade);

        // Ao colocar o 'F' estou especificando que é um FLOAT, da mesma forma se colosse um 'D' estaria falando que é um DOUBLE
        float salarioFloat = 2500.0F;
        double salarioDouble = 2500.0;

        long numeroGrande = 100000;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        // Casting: Forçar um valor que não pertence em outro
        int age = (int) 1000000000L;

        //String
        String texto = "È um grande textoooooo";
        System.out.println(texto);
    }
}