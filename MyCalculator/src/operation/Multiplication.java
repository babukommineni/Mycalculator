package operation;

import java.math.BigDecimal;

public class Multiplication implements OperationBase {

	@Override
	public BigDecimal performOperation(BigDecimal left, BigDecimal right) {
		return left.multiply(right);
	}
}
