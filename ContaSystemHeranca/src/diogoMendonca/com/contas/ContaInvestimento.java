package diogoMendonca.com.contas;

public class ContaInvestimento extends Conta {

	private double taxa;
	private int prazo;
		
	public boolean sacar(double val) {
		if(getSaldo() >= val) {
			setSaldo(getSaldo() - (1 + (this.taxa/100))); // taxa de saque
			System.out.println("Saque Conta Investimento Realizada!");
			return true;
		} else {
			System.out.println("Saldo Insuficiente!");
			return false;	
		}
	}
	
	public boolean depositar(double val) {
		if(val < 0) {
			return false;
		} else {
			setSaldo(getSaldo() + val);
			System.out.println("Deposito Conta Investimento Realizado!");
			return true;
		}
	}

	public void aplicarRendimento() {
		setSaldo(getSaldo() * (1 + (taxa/100)));
	}

	public ContaInvestimento() {
		
	}
	
	public ContaInvestimento(double taxa, int prazo) {
		super();
		this.taxa = taxa;
		this.prazo = prazo;
	}

	
}