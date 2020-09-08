package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class Televisao {

	private int canal;
	private String marca;
	private float tamanho;

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public int aumentarCanal() {
		setCanal(getCanal() + 1);
		return canal;
	}

	public int abaixaCanal() {
		setCanal(getCanal() - 1);
		return canal;
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null,
				"Marca: " + getMarca() + "\nTamanho: " + getTamanho() + "\nCanal: " + getCanal());
	}
}
