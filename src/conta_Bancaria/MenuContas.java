package conta_Bancaria;

import java.util.Scanner;

import conta_Bancaria.model.ContaCorrente;
import conta_Bancaria.model.ContaPoupanca;

public class MenuContas {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Escolha uma opção:");
		    System.out.println("1 - Conta Corrente");
		    System.out.println("2 - Conta Poupança");
		    int opcao = scanner.nextInt();
		    
		    if (opcao == 1) {
		      ContaCorrente contaCorrente = new ContaCorrente(1, "José", 1000);
		      keyPress(contaCorrente);
		    }
		    else if (opcao == 2) {
		      ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Maria", 2000, 0.1);
		      keyPress(contaPoupanca);
		    }
		    else {
		      System.out.println("Opção inválida!");
		    }
		  }
		  
		  public static void keyPress(Object conta) {
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Escolha uma transação:");
		    System.out.println("1 - Deposito");
		    System.out.println("2 - Saque");
		    System.out.println("3 - Transferência");
		    if (conta instanceof ContaPoupanca) {
		      System.out.println("4 - Rendimento Mensal");
		    }
		    int opcao = scanner.nextInt();
		    
		    if (opcao == 1) {
		      System.out.println("Digite o valor do depósito:");
		      double valor = scanner.nextDouble();
		      if (conta instanceof ContaCorrente) {
		        ContaCorrente contaCorrente = (ContaCorrente) conta;
		        contaCorrente.depositar(valor);
		      }
		      else if (conta instanceof ContaPoupanca) {
		        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
		        contaPoupanca.depositar(valor);
		      }
		    }
		    else if (opcao == 2) {
		      System.out.println("Digite o valor do saque:");
		      double valor = scanner.nextDouble();
		      if (conta instanceof ContaCorrente) {
		        ContaCorrente contaCorrente = (ContaCorrente) conta;
		        contaCorrente.sacar(valor);
		      }
		      else if (conta instanceof ContaPoupanca) {
		        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
		        contaPoupanca.sacar(valor);
		      }
		    }
		    else if (opcao == 3) {
		      System.out.println("Digite o valor da transferência:");
		      double valor = scanner.nextDouble();
		      System.out.println("Digite o número da conta de destino:");
		      int numeroDaContaDestino = scanner.nextInt();
		      if (conta instanceof ContaCorrente) {
		        ContaCorrente contaCorrente = (ContaCorrente) conta;
		        ContaCorrente contaDestino = new ContaCorrente(numeroDaContaDestino, "", 0);
		        contaCorrente.transferir(contaDestino, valor);
		      }
		      else if (conta instanceof ContaPoupanca) {
		        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
		        ContaPoupanca contaDestino = new ContaPoupanca(numeroDaContaDestino, "", 0, 0);
		        contaPoupanca.transferir(contaDestino, valor);
		      }
		    }
		    else if (opcao == 4) {
		      if (conta instanceof ContaPoupanca) {
		        ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
		        contaPoupanca.render();
		      }
		    }
		    else {
		      System.out.println("Opção inválida!");
		    }
		  }

		
}
