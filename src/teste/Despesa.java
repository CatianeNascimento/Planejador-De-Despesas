package teste;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Despesa {
	int posicao;
	double soma;
	static ArrayList<String> nomeDespesa = new ArrayList<String>();
	static ArrayList<String> tipoDespesa = new ArrayList<String>();
	static ArrayList<Double> valorDespesa = new ArrayList<Double>();

	public Despesa() {
	}

	public ArrayList<String> getNomeDespesa() {
		return nomeDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa.add(nomeDespesa);
	}

	public ArrayList<String> getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa.add(tipoDespesa);
	}

	public ArrayList<Double> getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(Double valorDespesa) {
		this.valorDespesa.add(valorDespesa);
	}

	// Marcos - Listar Despesas
	public void visualizarDespesa() {
		for (int i = 0; i < nomeDespesa.size(); i++) {
			System.out.println("Nome da Despesa: " + nomeDespesa.get(i) + "\tValor Despesa: " + this.formataMoeda(valorDespesa.get(i))
					+ "\tTipo Despesa: " + tipoDespesa.get(i));
		}
	}

	// Joas - Cadastrar Despesa
	public void cadastrarDespesa(String nomeDespesa, int tipoDespesa, double valorDespesa) {
		switch (tipoDespesa) {
		case 1:
			setTipoDespesa("Contas");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		case 2:
			setTipoDespesa("Compras");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		case 3:
			setTipoDespesa("Lazer");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		case 4:
			setTipoDespesa("Viagem");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		case 5:
			setTipoDespesa("Outros");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		default:
			System.err.println("Opção inválida, entre novamente com os dados");
			break;
		}
	}

	// Thiago - Excluir Despesa
	public void excluirDespesa() {

	}

	// Bia - Editar Despesa
	public void alterarDespesa(String novoNome, double novoValor, int novoTipo) {
		this.nomeDespesa.remove(posicao);
		this.valorDespesa.remove(posicao);
		this.tipoDespesa.remove(posicao);

		switch (novoTipo) {
		case 1:
			setTipoDespesa("Contas");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		case 2:
			setTipoDespesa("Compras");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		case 3:
			setTipoDespesa("Lazer");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		case 4:
			setTipoDespesa("Viagem");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		case 5:
			setTipoDespesa("Outros");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		default:
			System.err.println("Opção inválida, entre novamente com os dados");
			break;
		}
	}
	
	//Verifica se a despesa já está na lista
	public boolean verificaDespesa(String nomeDespesa) {
		if (this.nomeDespesa.contains(nomeDespesa)) {
			posicao = this.nomeDespesa.indexOf(nomeDespesa);
			return true;
		} else {
			return false;
		}

	}
	
	//Verifica o valor final sobrante/faltante para pagamento das despesas
	public void calculaDespesa(double montante) {
		for(double i:valorDespesa) {
			soma+=i;
		}
		
		if(montante-soma>0) {
			System.out.println("Você conseguirá pagar todas as despesas com sobra de "+formataMoeda(montante-soma));
		}
		else if(montante-soma<0){
			System.out.println("Ficará faltando "+formataMoeda(montante-soma)+" para pagar suas despesas");
		}
		else {
			System.out.println("Você tem o valor exato para pagar todas as despesas!!");
		}
	}
	
	//formatar valor double para moeda padrão (Brasil)
	public String formataMoeda(double valor) {
		NumberFormat valorFormatado = NumberFormat.getCurrencyInstance();
		
		valorFormatado.setMinimumFractionDigits(2);
			String valorFinal = valorFormatado.format(valor);
			return valorFinal;
	}
}
