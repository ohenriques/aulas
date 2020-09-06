package aula02.ClassesConceitosOO.Heranca;

//classe FILHA [sub classe]

public class Funcionario extends Pessoa{

//	atributos proprios da classe
	private int registro;
	
	public Funcionario (String nome, int rg, int registro) {
		super(nome,rg);
	}
	
}
