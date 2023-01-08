package br.com.erudio.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.erudio.converters.ValidaNumero;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class SimpleMath {
	
	public Double sum(Double numberOne,Double numberTwo) {
		return numberOne + numberTwo;
	}

	public Double sub(Double numberOne,Double numberTwo) {
		return numberOne - numberTwo;
	}
		
	public Double mult(Double numberOne,Double numberTwo) {
		return numberOne * numberTwo;
	}

	public Double divisao(Double numberOne,Double numberTwo) {
		
		return numberOne / numberTwo;
		
	}
	
	public Double media(Double numberOne,Double numberTwo)  {
		
		return (numberOne + numberTwo)/2;
	}
	
	public Double raiz(Double numberOne) {
		return Math.sqrt(numberOne) ;
	}
}
