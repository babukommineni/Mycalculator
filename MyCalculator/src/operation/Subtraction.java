package operation;

import java.math.BigDecimal;

public class Subtraction implements OperationBase {

	@Override
	public BigDecimal performOperation(BigDecimal left, BigDecimal right) {
		return left.subtract(right);
	}

}
