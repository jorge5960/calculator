package en.demo.calculator.controller.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(includeFieldNames=true)
public class CalculatorOutVO {

	@Getter
	@Setter
	private double result;
	
}
