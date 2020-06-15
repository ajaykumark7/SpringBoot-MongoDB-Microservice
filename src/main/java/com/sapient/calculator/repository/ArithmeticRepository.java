package com.sapient.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.calculator.dto.Calculator;
//Here, Calculator refers to the DTO class and NOT the DB name
public interface ArithmeticRepository extends MongoRepository<Calculator, String>{

}
