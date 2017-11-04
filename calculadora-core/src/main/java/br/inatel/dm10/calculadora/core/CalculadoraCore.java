package br.inatel.dm10.calculadora.core;

import br.inatel.dm110.calculadora.api.ICalculadora;
import br.inatel.dm110.calculadora.api.Result;

public class CalculadoraCore implements ICalculadora {

	@Override
	public Result sum(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		int soma = first + second;
		result.setResult(soma);
		return result;
	}

	@Override
	public Result sub(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		int subt = first - second;
		result.setResult(subt);
		return result;
	}

}
