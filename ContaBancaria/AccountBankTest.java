package ContaBancaria;

public class AccountBankTest {
        public static void main(String[] args) {
            // Criando uma conta bancária
            AccountBank conta = new AccountBank("João", 1000.0);

            // Depositando e sacando dinheiro
            conta.depositar(500.0);
            conta.sacar(200.0);

            // Obtendo o saldo e titular
            System.out.println("Saldo: " + conta.getSaldo());  // Saída: Saldo: 1300.0
            System.out.println("Titular: " + conta.getTitular()); // Saída: Titular: João

            // Alterando o titular
            conta.setTitular("Maria");
            System.out.println("Novo Titular: " + conta.getTitular()); // Saída: Novo Titular: Maria
        }
    }


