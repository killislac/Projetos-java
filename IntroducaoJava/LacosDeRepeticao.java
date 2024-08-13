package IntroducaoJava;
public class LacosDeRepeticao {
    public static void main(String[] args) {
       // while do while for

        //while
        int count = 0;
        while(count < 10){
           count = count + 1;
           System.out.println( count );
        }
        
        // do while
       count = 0 ;
        do{
            System.out.println("Detro do do-while"+ ++count);
        }while(count < 10);

        // for( 1°parte: declara a variavel.
        // 2°parte: definir ate onde esse lanco de repeticao quer ser executado.
        // 3° parte: Como essa variavel vai alter o status

        for(int i=0; i<10; i++){ // PARA 'i' comecando de 0, até o i ser menor que 10 encremente mais 1
            System.out.println("For"+ i);
        }
    }
}
