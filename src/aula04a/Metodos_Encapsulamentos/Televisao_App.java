package aula04a.Metodos_Encapsulamentos;

public class Televisao_App {

	public static void main(String[] args) {

		Televisao tv1 = new Televisao();

		tv1.setCanal(2);
		tv1.setMarca("Philco");
		tv1.setTamanho(21.5f);

		tv1.aumentarCanal();
		tv1.imprimir();
		tv1.abaixaCanal();
		tv1.imprimir();
	}
}
