package aula04a.Metodos_Encapsulamentos;

public class Triangulo_GetSets {

	private int base;
	private int altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float calculeArea() {
		return getBase() * getAltura();

	}

	public void imprimeDados() {
		System.out.println("Base: " + getBase() + "\nAltura: " + getAltura()
				+ "\nArea do triangulo: " + calculeArea());
	}

}
