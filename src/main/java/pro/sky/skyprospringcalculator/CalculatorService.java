package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService implements ICalculatorService{

    public String helloCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator( Integer  num1, Integer num2){
        return num1 + " + " + num2 + " = " + " " + (num1 + num2);
    }

    public String minusCalculator(Integer  num1, Integer num2){
        return num1 + " - " + num2 + " = " + " " + (num1 - num2);
    }

    public String multiplyCalculator(Integer  num1, Integer num2){
        return num1 + " * " + num2 + " = " + " " + (num1 * num2);
    }

    public String divideCalculator(Double num1, Double num2){
        return num1 + " / " + num2 + " = " + " " + (num1 / num2);
    }
}
