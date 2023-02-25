package teste;

import java.util.Scanner;

public class AlterarDespesa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alterar;

		System.out.println(" Escolha uma opção caso deseja editar uma despesa ");
		System.out.println("     1 - Alterar Nome da Despesa ");
		System.out.println("     2 - Alterar Valor da Despesa ");
		alterar = sc.nextInt();

		switch (alterar) {
		case 1:
			System.out.println("Alterar o nome");
			System.out.println("Digite o nome da despesa que deseja alterar  na sua despesa: ");
			String verificar = sc.nextLine();
			System.out.println("Digite o novo nome da sua despesa: ");
			String novoNome = sc.nextLine();
			break;
		case 2:
			System.out.println("Alterar valor ");
			System.out.println("Digite o valor da despesa que deseja alterar  na sua despesa: ");
			float verificarValor = sc.nextFloat();
			System.out.println("Digite o valor da despesa que deseja alterar " + verificarValor);
			float novoValor = sc.nextInt();
			break;
		default:
			System.out.println("Opção Invalida!!");
			break;
		}
	}

}
