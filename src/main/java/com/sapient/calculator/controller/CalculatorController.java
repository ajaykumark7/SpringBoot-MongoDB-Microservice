 package com.sapient.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.calculator.dto.Calculator;
import com.sapient.calculator.service.CalculatorService;
import com.sapient.calculator.service.CalculatorServiceImpl;

@RestController
@RequestMapping("/api/v1/calculate")
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping("/add")
	public Calculator getSum(@RequestBody Calculator calculator)
	{
		calculator.setResult(calculatorService.getSum(calculator.getValA(), calculator.getValB()));
		return calculatorService.saveCalculation(calculator);
//		return calculatorService.getSum(calculator.getValA(), calculator.getValB());
	}
}
