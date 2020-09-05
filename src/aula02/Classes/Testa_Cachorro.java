package aula02.Classes;

public class Testa_Cachorro {
	public static void main(String[] args) {

		Cachorro rex = new Cachorro();
		rex.tamanho = 23;
		Cachorro pluto = new Cachorro();
		pluto.tamanho = 10;
		Cachorro abu = new Cachorro();
		abu.tamanho = 66;
		
		rex.falar();
		pluto.falar();
		abu.falar();
	}
}
