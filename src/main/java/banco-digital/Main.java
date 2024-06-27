package DioBank;

public class Main {

    public static void main(String[] args) {
        Cliente Bruno = new Cliente();
        Bruno.setNome("Bruno");

        Conta cc = new ContaPoupanca(Bruno);
        Conta poupanca = new ContaCorrente(Bruno);

        cc.depositar(56459);
        cc.transferir(10500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        }
}
