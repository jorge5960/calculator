package en.demo.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import en.demo.calculator.controller.vo.CalculatorInVO;
import en.demo.calculator.controller.vo.CalculatorOutVO;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/add")
	public CalculatorOutVO add(CalculatorInVO param) {
		CalculatorOutVO calculatorOutVO = new CalculatorOutVO();
		calculatorOutVO.setResult(0.0);
		return calculatorOutVO;
	}
    
    @PostMapping("/substract")
	public CalculatorOutVO subtract(CalculatorInVO param) {
		CalculatorOutVO calculatorOutVO = new CalculatorOutVO();
		calculatorOutVO.setResult(0.0);
		return calculatorOutVO;
	}
	
}
