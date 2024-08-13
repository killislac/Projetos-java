package IntroducaoJava;

public class EXercSwitch {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 , fale quais sao dias uteis e finais de semana
        byte day = 4;
       switch(day) {
           case 1: case 7:
               System.out.println("Final de semana"); 
               break;
           case 2: case 3: case 4: case 5: case 6:
               System.out.println("Dias uteis");
               break;


       }
    }
}
