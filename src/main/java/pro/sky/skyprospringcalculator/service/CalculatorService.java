package pro.sky.skyprospringcalculator.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcalculator.ICalculatorService;

@Service
public class CalculatorService implements ICalculatorService {


    public Integer plusCalculator( Integer  num1, Integer num2){
        return num1 + num2;
    }

    public Integer minusCalculator(Integer  num1, Integer num2){
        return num1 - num2;
    }

    public Integer multiplyCalculator(Integer  num1, Integer num2){
        return num1 * num2;
    }

    public Double divideCalculator(Double num1, Double num2){
        return num1 / num2;
    }
}
