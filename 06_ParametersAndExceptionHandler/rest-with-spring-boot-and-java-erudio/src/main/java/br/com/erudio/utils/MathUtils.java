package br.com.erudio.utils;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class MathUtils {

	public Double converterToDouble(String strNumber) {
		if (strNumber == null) {
			return 0D;
		}
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) {
			return Double.parseDouble(number);
		}
		return 0D;
	}

	public boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	public void validation(String numberOne) {
		if(!isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
	}
}
