
public class Poupanca extends Conta {
	public Poupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Imprimir Extrato Conta Poupança ***");
		super.imprimirInfoComuns();
	}
}
