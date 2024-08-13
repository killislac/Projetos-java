package IntroducaoJava;

public class Switch {
    public static void main(String[] args) {
        //Imprima dias da semana considerando 1 domingo.
        byte dia = 5;
        //só se pode usar valores como: char, int, byte ,short , enum ,String.
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            // Opcao padrao - pode estar em qualquer lugar do  codigo
            default:
                System.out.println( "Opcao invalida");
        }
        }
    }