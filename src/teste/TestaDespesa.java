package teste;

import java.util.Scanner;

public class TestaDespesa {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Despesa despesa = new Despesa();
		
		int opcao;
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
			System.out.println("\t    5 - Sair                 ");
			System.out.println("\t                             ");
			System.out.println("\t-----------------------------");
			System.out.println("\tEntre com a opção desejada:  ");
			System.out.println("\t                             ");
			System.out.println("\t                             ");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("    1 - Cadastrar Despesas\n\n");
				int o =tipoDespesa();
				
				System.out.println("Digite o nome da despesa: ");
				nomeDespesa = s.next();
				
				System.out.println("Digite o valor da despesa: ");
				valorDespesa = s.nextDouble();
				
				despesa.setNomeDespesa(nomeDespesa);
				despesa.setValorDespesa(valorDespesa);
				
				break;
				
			case 2:
				System.out.println("    2 - Listar todas as Despesas/n/n");
				despesa.visualizarDespesa();
				break;
				
			case 3:
				System.out.println("    3 - Alterar Despesas/n/n ");
				despesa.alterarDespesa();
				break;
				
			case 4:
				System.out.println("    4 - Apagar Despesas/n/n ");
				despesa.excluirDespesa();
				break;
				
			case 5:
				System.out.println("\nObrigada por utilizar nosso planejador de despesas!");
				s.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção Invalida!");
				break;

			} // fim switch
		} while (opcao != 5);
		
		

	}
	
	public static int tipoDespesa() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha o tipo da Despesa: ");
		System.out.println("1 - Viagem");
		System.out.println("2 - Contas");
		System.out.println("3 - Lazer");
		int op = leia.nextInt();
		return op;
		
	}

}
