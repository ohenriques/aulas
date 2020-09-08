package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class ContaAgua {

	private int numero, mes, ano;
	private float m3, valor;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = Float.parseFloat(JOptionPane.showInputDialog("m3:",m3));
	}

	public float getValor() {
		return valor;
	}

	public void calcularValor() {
	this.valor = this.m3 * 10.5f;
	}

	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, "Numero: " + getNumero() + "\nMes: " + getMes() + "\nAno: " + getAno()
				+ "\nM3: " + getM3() + "\nValor: R$" + getValor());
	}

}
