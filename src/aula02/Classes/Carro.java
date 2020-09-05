package aula02.Classes;

public class Carro {

//	atributos
	public String marca;
	public String modelo;
	public int ano;
	public float valor;
	public boolean statusMotor;

//	métodos / ações
	public void ligar() {
		statusMotor = true;
		System.out.println("Marca: " + marca + " / Modelo: " + modelo + " / Ano: " + ano + " / valor: " + valor
				+ " / Motor ligado: " + statusMotor);
	}

	public void desligar() {
		System.out.println("Marca: " + marca + " / Modelo: " + modelo + " / Ano: " + ano + " / valor: " + valor
				+ " / Motor ligado: " + statusMotor);
	}

}
