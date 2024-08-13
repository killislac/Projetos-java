package IntroducaoJava;

public class Array2 {
    public static void main(String[] args) {
        // byte , shor , int ,long, float e double = 0
        //char = vazio
        //boolean = false
        //String = null
        String [] nomes = new String [3];
        nomes [0] = "Kamily";
        nomes [2] = "Kyln";
        nomes [1] = "Maria";

        for (int i = 0; i < nomes.length; i++) { //nomes.length = retorno o tamno do array
            System.out.println(nomes[i]);
        }

    }
}
