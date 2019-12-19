package com.sapient.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.calculator.dto.Calculator;

public interface ArithmeticRepository extends MongoRepository<Calculator, String>{

}
