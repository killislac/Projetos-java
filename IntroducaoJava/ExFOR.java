package IntroducaoJava;

public class ExFOR {
    public static void main(String[] args) {
        for( int i = 0; i <= 1000000; i++){ // i+=2 conta de dois em dois funciona somente se o i for igual a 0
            if (i%2 == 0){
                System.out.println("Numeros pares"+ i);
            }
        }
    }
}
