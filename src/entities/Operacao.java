package entities;

public class Operacao {
	
	private int num1;
	private int num2;
	private char operador;
	
	public Operacao(int num1, int num2, char operador) {
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}	
	
}
