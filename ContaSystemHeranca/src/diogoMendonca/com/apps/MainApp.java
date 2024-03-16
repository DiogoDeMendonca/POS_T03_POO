package diogoMendonca.com.apps;

import diogoMendonca.com.contas.*;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		double valor;
		
//		##### Herdando de ContaInvestimento:
		Scanner entrada = new Scanner(System.in);
		
		ContaInvestimento ci = new ContaInvestimento();
		
		System.out.println(String.format("SALDO: R$%.2f", ci.getSaldo()));
				
		System.out.println("Qual valor deseja DEPOSITAR?");
		valor = entrada.nextDouble();
		ci.depositar(valor);
		
		System.out.println(String.format("SALDO: R$%.2f", ci.getSaldo()));
		
		System.out.println("Qual valor deseja SACAR?");
		valor = entrada.nextDouble();
		System.out.println("Saque Realizado com Sucesso? " + ci.sacar(valor));
		
		System.out.println(String.format("SALDO: R$%.2f", ci.getSaldo()));
		
		
			entrada.close();
		
			
//			##### Herdando de ContaEspecial:
			
//			Conta contaT = new Conta();
	//
//			System.out.println("Qual valor deseja DEPOSITAR?");
//				valor = entrada.nextDouble();
//			
//			contaT.depositar(valor);
//			
//			System.out.println(String.format("SALDO: R$%.2f", contaT.getSaldo()));
	//
//			System.out.println("Qual valor deseja SACAR?");
//			valor = entrada.nextDouble();
//			
//			System.out.println("Saque Realizado com Sucesso? " + contaT.sacar(valor));
//			
//			System.out.println(String.format("SALDO: R$%.2f", contaT.getSaldo()));


	}

}
