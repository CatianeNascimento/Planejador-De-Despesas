package teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Despesa {
	int posicao;

	ArrayList<String> nomeDespesa = new ArrayList<String>();
	ArrayList<String> tipoDespesa = new ArrayList<String>();
	ArrayList<Double> valorDespesa = new ArrayList<Double>();

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

	// Marcos
	public void visualizarDespesa() {
		for (int i = 0; i < nomeDespesa.size(); i++) {
			System.out.println("Nome da Despesa: " + nomeDespesa.get(i) + "\tValor Despesa: " + valorDespesa.get(i)
					+ "\tTipo Despesa: " + tipoDespesa.get(i));
		}
	}

	// Joas
	public void cadastrarDespesa(String nomeDespesa, int tipoDespesa, double valorDespesa) {
		switch (tipoDespesa) {
		case 1:
			setTipoDespesa("Viagem");
			setNomeDespesa(nomeDespesa);
			setValorDespesa(valorDespesa);
			System.out.println("Despesa cadastrada com sucesso! \n");
			break;

		case 2:
			setTipoDespesa("Contas");
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
			setTipoDespesa("Compras");
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

	// Thiago
	public void excluirDespesa() {

	}

	// Bia
	public boolean verificaDespesa(String nomeDespesa) {
		if (this.nomeDespesa.contains(nomeDespesa)) {
			posicao = this.nomeDespesa.indexOf(nomeDespesa);
			return true;
		} else {
			return false;
		}

	}

	public void alterarDespesa(String novoNome, double novoValor, int novoTipo) {
		this.nomeDespesa.remove(posicao);
		this.valorDespesa.remove(posicao);
		this.tipoDespesa.remove(posicao);

		switch (novoTipo) {
		case 1:
			setTipoDespesa("Viagem");
			setNomeDespesa(novoNome);
			setValorDespesa(novoValor);
			System.out.println("Despesa alterada com sucesso! \n");
			break;

		case 2:
			setTipoDespesa("Contas");
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
			setTipoDespesa("Compras");
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
}
