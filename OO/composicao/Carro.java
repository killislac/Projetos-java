package OO.composicao;

public class Carro {
    final Motor motor;
    Carro(){
        this.motor = new Motor(this);
    }
    void acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }

    void ligado(){
        motor.ligado = true;
    }

    void desligado(){
        motor.ligado = false;
    }
    boolean estaligado(){
        return motor.ligado;
    }
}
