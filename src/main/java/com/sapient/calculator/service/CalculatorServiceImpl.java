package com.sapient.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.calculator.dto.Calculator;
import com.sapient.calculator.repository.ArithmeticRepository;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	@Autowired
	private ArithmeticRepository arithmeticRepository;
	public int getSum(int a,int b) {
		return a+b;
	}
	public Calculator saveCalculation(Calculator calculator)
	{
		return arithmeticRepository.save(calculator);
	}
}
