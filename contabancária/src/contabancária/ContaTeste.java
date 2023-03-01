package contabancária;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
		
		//conta.deposita(8000);
		//conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 8_000.0;
		destino.exibesaldo();

	}

}
