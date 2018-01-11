package br.com.viniciusgeraldoruas.webservices;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class Calculadora {
	public double calcular(@WebParam(name = "num1") double x, @WebParam(name = "operador") String op,
			@WebParam(name = "num2") double y) {
		switch (op) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;
		default:
			throw new IllegalArgumentException("Operador inválido!");
		}

	}
}
