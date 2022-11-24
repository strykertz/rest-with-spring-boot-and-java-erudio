package br.com.erudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtils;

@RestController
public class MathController {

	private MathUtils mathUtils;

	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		mathUtils.validation(numberOne);
		return mathUtils.converterToDouble(numberOne) + mathUtils.converterToDouble(numberTwo);
	}

	@GetMapping(value = "/subtract/{numberOne}/{numberTwo}")
	public Double subtract(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		mathUtils.validation(numberOne);
		return mathUtils.converterToDouble(numberOne) - mathUtils.converterToDouble(numberTwo);
	}

	@GetMapping(value = "/multiply/{numberOne}/{numberTwo}")
	public Double multiply(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		mathUtils.validation(numberOne);
		return mathUtils.converterToDouble(numberOne) * mathUtils.converterToDouble(numberTwo);
	}

	@GetMapping(value = "/divide/{numberOne}/{numberTwo}")
	public Double divide(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		mathUtils.validation(numberOne);
		return mathUtils.converterToDouble(numberOne) / mathUtils.converterToDouble(numberTwo);
	}

	@GetMapping(value = "/media/{numberOne}/{numberTwo}")
	public Double saberMedia(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		mathUtils.validation(numberOne);
		return (mathUtils.converterToDouble(numberOne) + mathUtils.converterToDouble(numberTwo)) / 2;
	}

	@GetMapping(value = "/rquadrada/{numberOne}")
	public Double raizQuadrada(@PathVariable(value = "numberOne") String numberOne) throws Exception {

		mathUtils.validation(numberOne);
		return Math.sqrt(mathUtils.converterToDouble(numberOne));
	}

}
