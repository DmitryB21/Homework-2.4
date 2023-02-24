package pro.sky.skyprospringcalculator;

public interface ICalculatorService {

    String helloCalculator();
    String plusCalculator( Integer  num1, Integer num2);
    String minusCalculator(Integer  num1, Integer num2);
    String multiplyCalculator(Integer  num1, Integer num2);
    String divideCalculator(Double num1, Double num2);

}
