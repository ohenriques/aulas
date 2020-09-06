package aula03.Classes;

public class VendasTicketCinema {

//	atributos
	public String tituloFilme;
	public float valorIngresso = 7.50f;
	public float total;

//	métodos
	public void comprar(float valor) {
		this.total = valorIngresso * valor;
	}

	public void recibo() {
		System.out.println("Titulo do filme: " + tituloFilme + "\nValor unitário: " + valorIngresso + "\nQuantidade: "
				+ total / valorIngresso + "\nTotal: " + total);
	}
}
