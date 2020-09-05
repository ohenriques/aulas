package aula02.Classes;

public class Testa_Aluno {
	public static void main(String[] args) {

//		instanciando o objeto da classe Aluno e setando os dados
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Paulo";
		aluno1.idade = 12;
		aluno1.altura = 1.5f;

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Henrique";
		aluno2.idade = 20;
		aluno2.altura = 1.88f;
		
//		imprimindo os valores do objeto via Método
		
		aluno1.imprimirEstado();
		System.out.println("-------------");
		aluno2.imprimirEstado();

	}
}
