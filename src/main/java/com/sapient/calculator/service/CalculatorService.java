package com.sapient.calculator.service;

import com.sapient.calculator.dto.Calculator;

public interface CalculatorService {
	public int getSum(int a,int b);
	public Calculator saveCalculation(Calculator calculator);
}
