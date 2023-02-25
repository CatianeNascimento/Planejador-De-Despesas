package teste;

import java.io.IOException;
import java.util.Scanner;

public class TestaDespesa {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Despesa despesa = new Despesa();
		
		int opcao,tipoDespesa;
		String nomeDespesa;
		double valorDespesa;

		do {
			System.out.println("\t-----------------------------");
			System.out.println("\t                             ");
			System.out.println("\tPLANEJADOR DE DESPESAS SQUAD 05");
			System.out.println("\t                             ");
			System.out.println("\t-----------------------------");
			System.out.println("\t    1 - Cadastrar Despesas   ");
			System.out.println("\t    2 - Listar todas as Despesas");
			System.out.println("\t    3 - Editar Despesas      ");
			System.out.println("\t    4 - Apagar Despesas      ");
			System.out.println("\t    5 - Calcular Despesa     ");
			System.out.println("\t    6 - Sair                 ");
			System.out.println("\t-----------------------------");
			System.out.println("\tEntre com a opção desejada:  ");
			System.out.println("\t                             ");
			System.out.println("\t                             ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("1 - Cadastrar Despesas\n\n");
				System.out.println("Escolha o tipo da Despesa: ");
				System.out.println("1 - Viagem");
				System.out.println("2 - Contas");
				System.out.println("3 - Lazer");
				System.out.println("4 - Compras");
				System.out.println("5 - Outros");
				tipoDespesa = leia.nextInt();
				
				System.out.println("Digite o nome da despesa: ");
				leia.skip("\\R?");
				nomeDespesa = leia.nextLine();
				
				System.out.println("Digite o valor da despesa: ");
				valorDespesa = leia.nextDouble();
				
				despesa.cadastrarDespesa(nomeDespesa,tipoDespesa,valorDespesa);
				
				keyPress();
				break;
				
			case 2:
				System.out.println("2 - Listar todas as Despesas\n\n");
				despesa.visualizarDespesa();
				
				keyPress();
				break;
				
			case 3:
				System.out.println("3 - Alterar Despesas\n\n ");
				despesa.alterarDespesa();
				
				keyPress();
				break;
				
			case 4:
				System.out.println("4 - Apagar Despesas\n\n");
				despesa.excluirDespesa();
				
				keyPress();
				break;
				
			case 5:
				System.out.println("Calcular despesa:");
				
				keyPress();
				break;
				
			case 6:
				System.out.println("\nObrigada por utilizar nosso planejador de despesas!");
				leia.close();
				System.exit(0);
				
				break;
				
			default:
				System.out.println("Opção Invalida!");
				keyPress();
				break;

			} // fim switch
		} while (opcao != 5);
	}
	
	public static void keyPress() {
		try {
			System.out.println("Pressione a tecla Enter para Continuar a utilizar nosso serviço...");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Utilize a tecla Enter para continuar!");
		}
	}

}
