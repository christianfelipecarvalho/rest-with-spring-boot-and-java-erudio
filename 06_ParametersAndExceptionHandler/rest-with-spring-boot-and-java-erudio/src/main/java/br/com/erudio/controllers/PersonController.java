package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.ValidaNumero;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController

public class PersonController {
	
	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value ="/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne")String numberOne, 
			@PathVariable(value = "numberTwo")String numberTwo
			) throws Exception{
		
		if(!ValidaNumero.isNumeric(numberOne)|| !ValidaNumero.isNumeric(numberTwo))  {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.sum(ValidaNumero.convertToDouble(numberOne), ValidaNumero.convertToDouble(numberTwo));
	}


	@RequestMapping(value ="/sub/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "numberOne")String numberOne, 
			@PathVariable(value = "numberTwo")String numberTwo
			) throws Exception{
		
		
		return math.sub(ValidaNumero.convertToDouble(numberOne), ValidaNumero.convertToDouble(numberTwo));
	}
	
	
	@RequestMapping(value ="/mult/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "numberOne")String numberOne, 
			@PathVariable(value = "numberTwo")String numberTwo
			) throws Exception{
		
		if(!ValidaNumero.isNumeric(numberOne)|| !ValidaNumero.isNumeric(numberTwo))  {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.mult(ValidaNumero.convertToDouble(numberOne), ValidaNumero.convertToDouble(numberTwo));
	}

	@RequestMapping(value ="/divisao/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double divisao(
			@PathVariable(value = "numberOne")String numberOne, 
			@PathVariable(value = "numberTwo")String numberTwo
			) throws Exception{
		
		if(!ValidaNumero.isNumeric(numberOne)|| !ValidaNumero.isNumeric(numberTwo))  {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.divisao(ValidaNumero.convertToDouble(numberOne), ValidaNumero.convertToDouble(numberTwo));
		
	}
	@RequestMapping(value ="/media/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double media(
			@PathVariable(value = "numberOne")String numberOne, 
			@PathVariable(value = "numberTwo")String numberTwo
			) throws Exception{
		
		if(!ValidaNumero.isNumeric(numberOne)|| !ValidaNumero.isNumeric(numberTwo))  {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.media(ValidaNumero.convertToDouble(numberOne), ValidaNumero.convertToDouble(numberTwo));
	}
	@RequestMapping(value ="/raiz/{numberOne}",method=RequestMethod.GET)
	public Double raiz(
			@PathVariable(value = "numberOne")String numberOne 
			) throws Exception{
		
		if(!ValidaNumero.isNumeric(numberOne))  {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.raiz(ValidaNumero.convertToDouble(numberOne));
	}
}
