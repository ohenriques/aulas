package aula02.Classes;

public class Cachorro {

//			Atributos
	public int tamanho;
	public String nome;
	public String corOlhos;
	public int peso;

//			MÉTODOS
	void falar() {
		if (tamanho > 60)
			System.out.println("Woff, Woff, maior que 60");
		else if (tamanho > 14)
			System.out.println("Ruff, Ruff, maior que 14");
		else
			System.out.println("Yup, Yup, menor que 14");
	}
}
