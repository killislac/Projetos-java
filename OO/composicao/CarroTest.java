package OO.composicao;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.estaligado());

        carro.ligado();
        System.out.println(carro.estaligado());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());



        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro.motor.giros());

    }
}
