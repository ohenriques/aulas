package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class Data {

	private int dia, mes, ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void entraDados() {

	}

	public void imprimeData() {
		
		JOptionPane.showMessageDialog(null, getDia()+"/"+ getMes()+"/"+ getAno());
	}

}
