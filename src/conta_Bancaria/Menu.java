package conta_Bancaria;

import java.util.Scanner;

import conta_Bancaria.model.ContaCorrente;
import conta_Bancaria.model.ContaPoupanca;

import conta_Bancaria.model.Conta;
import conta_Bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Criamos o Objeto Conta c1
		Conta c1 = new Conta(1, 123, 1, "Maria f", 30000.0f);

		// Visualizamos os dados da Conta c1
		c1.visualizar();

		// Alteramos os Dados da Conta c1
		c1.setSaldo(35000.0f);

		// Visualizamos o saldo da Conta c1
		System.out.println("\n\n" + c1.getSaldo());

		// Criamos o Objeto Conta c2
		Conta c2 = new Conta(2, 132, 1, "Aristoteles", 50000.0f);

		// Visualizamos os dados da Conta c2
		c2.visualizar();
		
		// Efetuamos um saque na Conta c2
		if (c2.sacar(100000.0f))
			System.out.println("\n\n" + c2.getSaldo());

		// Efetuamos um deposito na Conta c2
		c2.depositar(1000.0f);
		
		// Visualizamos um saque na Conta c1
		c1.getSaldo();

		int opcao;
		
		// Teste da Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(3, 123, 1, "Laise", 20000f, 1000f);
				cc1.visualizar();
				cc1.sacar(32000);
				cc1.visualizar();

				System.out.println("\n");

				// Teste da Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(4, 123, 2, "Maria", 40000f, 4);
				cp1.visualizar();
				System.out.println("\n");
				cp1.sacar(100);
				cp1.visualizar();
				System.out.println("\n");
				cp1.depositar(500);
				cp1.visualizar();

				int numero, agencia, tipo, opcao1, aniversario, numeroDestino;
				String titular;
				float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao1 = leia.nextInt();

			if (opcao1 == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao1) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

}
