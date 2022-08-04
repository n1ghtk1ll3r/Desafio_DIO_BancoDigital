package project_dio_java;

public class Main {
	
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		
		Conta cc = new ContaCorrente(guilherme);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(guilherme);
		cc.transferir(cp, 100);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
