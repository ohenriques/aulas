package aula03.Classes;

public class Teste_Cinema_Terminal {
	public static void main(String[] args) {

	VendasTicketCinema venda1 = new VendasTicketCinema();
	venda1.tituloFilme = "A lenda do tesouro perdido";
	venda1.comprar(5);
	venda1.recibo();
	}
}
