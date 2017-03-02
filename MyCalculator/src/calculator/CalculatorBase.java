package calculator;

import java.math.BigDecimal;

public interface CalculatorBase {

	/**
	 * Computes the value of mathematical expression.
	 * 
	 * @param expression
	 * @return BigDecimal
	 */
	 BigDecimal calculate(String expression);

}
