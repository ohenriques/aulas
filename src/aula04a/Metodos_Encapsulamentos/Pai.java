package aula04a.Metodos_Encapsulamentos;

public class Pai {

	public int a;
	protected int b;
	private int c;

	public Pai() {
		a = 10;
		b = 20;
		c = 30;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
