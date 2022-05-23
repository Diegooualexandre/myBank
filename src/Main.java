
public class Main {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNome("Francisco Diego Lima Alexandre");
		
		Conta cc = new Corrente(diego);
		Conta cp = new Poupanca(diego);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Cliente miro = new Cliente();
		miro.setNome("Miro Milosevic Arkaider");
		
		Conta cc1 = new Corrente(miro);
		Conta cp1 = new Poupanca(miro);
		
		cc1.depositar(256);
		cp1.transferir(50, cp1);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		
		

	}

}
