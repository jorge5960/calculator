package en.demo.calculator.controller.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(includeFieldNames=true)
public class CalculatorInVO {

	@Getter
	@Setter
	private double param1;
	
	@Getter
	@Setter
	private double param2;
	
}
