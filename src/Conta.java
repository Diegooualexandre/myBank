
public abstract class Conta implements Iconta {
	protected int Agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.Agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.setCliente(cliente);
	}

	
	
	//Métodos_Getters_e_Setters.
	
	public int getAgencia() {
		return Agencia;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		this.saldo-=valor;
	}


	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
	}


	@Override
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	protected void imprimirInfoComuns() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.Agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
}
