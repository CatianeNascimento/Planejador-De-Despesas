package teste;

import java.util.ArrayList;
import java.util.Iterator;

public class Despesa {
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


	
	//Marcos
	public void visualizarDespesa() {
		
	}
	
	//Joas
	public void cadastrarDespesa() {
		
	}
	
	//Thiago
	public void excluirDespesa() {
		
	}
	
	//Bia
	public void alterarDespesa() {
		
	}
}	
