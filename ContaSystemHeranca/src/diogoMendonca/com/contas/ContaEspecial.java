package diogoMendonca.com.contas;

public class ContaEspecial extends Conta {

	private double limite;
	
	public boolean sacarEspec(double val) {
		if(getSaldo() >= val) {
			setSaldo(getSaldo() - val);
			return true;
		} else {
			System.out.println("Saldo Insuficiente!");
			return false;	
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}