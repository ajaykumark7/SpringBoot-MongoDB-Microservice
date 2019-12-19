package com.sapient.calculator.dto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter	
@Document(collection = "arithmetic")
public class Calculator {
	@Id
	private String calculationId;
	private int valA;
	private int valB;
	private int result;
	
	public Calculator(int valA, int valB) {
		this.valA=valA;
		this.valB=valB;
	}
}
