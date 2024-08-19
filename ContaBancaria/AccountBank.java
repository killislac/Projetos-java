package ContaBancaria;

public class AccountBank {
        // Atributos privados
        private double saldo;
        private String titular;

        // Construtor
        public AccountBank(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        // Método público para depositar dinheiro
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        // Método público para sacar dinheiro
        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
        }

        // Método público para obter o saldo
        public double getSaldo() {
            return saldo;
        }

        // Método público para definir o titular
        public void setTitular(String titular) {
            this.titular = titular;
        }

        // Método público para obter o titular
        public String getTitular() {
            return titular;
        }
    }


