package aula03.Classes;

public class VendasTicketCinema {

//	atributos
	public String tituloFilme;
	public float valorIngresso = 7.50f;
	public float total;

//	m�todos
	public void comprar(float valor) {
		this.total = valorIngresso * valor;
	}

	public void recibo() {
		System.out.println("Titulo do filme: " + tituloFilme + "\nValor unit�rio: " + valorIngresso + "\nQuantidade: "
				+ total / valorIngresso + "\nTotal: " + total);
	}
}
