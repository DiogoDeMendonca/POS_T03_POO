package diogoMendonca.com.contas;

public class Conta {

	private int numero;
	private double saldo;
	
		
	public boolean sacar(double val) {
		if(this.saldo >= val) {
			this.saldo = this.saldo - val;
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
			this.saldo = this.saldo + val;
			return true;
		}
	}
	
	//METODOS GET/SET:
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}