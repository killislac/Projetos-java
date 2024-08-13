package IntroducaoJava;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
       boolean isIdadeAutorizadaBebida = idade > 18;
        if(isIdadeAutorizadaBebida != false){
            System.out.println("Voce pode comprar bebidas!");
        }else{
            System.out.println("Não autorizado a comprar bebidas");
        }
        // ! <- Sinal de NÂO
        if(!isIdadeAutorizadaBebida){
            System.out.println("Não autorizado a comprar bebidas");
        }
        /////////////////////////////////////////////////////////////////

        int age = 17;
        String categoria;
        if(age<15){
           categoria = "Categoria Infantil";
        }else if (age>= 15 && age <18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
