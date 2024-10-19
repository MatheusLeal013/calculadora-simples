package services;

import entities.Operacao;

public class CalculadoraService {

	public int calculo(Operacao operacao) {
		if (operacao.getOperador() == '+') {
			return operacao.getNum1() + operacao.getNum2();
		}
		if (operacao.getOperador() == '-') {
			return operacao.getNum1() - operacao.getNum2();
		}
		if (operacao.getOperador() == '*') {
			return operacao.getNum1() * operacao.getNum2();
		}
		return operacao.getNum1() / operacao.getNum2();
	}
}
