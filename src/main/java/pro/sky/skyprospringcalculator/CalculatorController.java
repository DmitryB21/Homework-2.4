package pro.sky.skyprospringcalculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final ICalculatorService calculatorService;

    public CalculatorController(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба числа";
        }

        return calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба числа";
        }

        return calculatorService.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба числа";
        }

        return calculatorService.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/divide")
    public ResponseEntity<?> divideCalculator(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {


        if (num1 == null || num2 == null) {
            return new ResponseEntity<>("Укажите оба числа", HttpStatus.NOT_ACCEPTABLE);
        }
          if (num2 == 0) {
            return new ResponseEntity<>("На ноль делить нельзя!", HttpStatus.NOT_ACCEPTABLE);
        }
        return ResponseEntity.ok(calculatorService.divideCalculator(num1, num2));

     // оказалось , что double делить на 0 можно, исключение не выбрасывается
      /* try {
           return ResponseEntity.ok(calculatorService.divideCalculator(num1, num2));
       } catch (ArithmeticException e) {
           return new ResponseEntity<>("На ноль делить нельзя!", HttpStatus.NOT_ACCEPTABLE);
        } catch (Exception e) {
           return new ResponseEntity<>("Укажите оба числа", HttpStatus.NOT_ACCEPTABLE);
       }*/

    }
}
