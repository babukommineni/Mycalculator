package operation;

import java.math.BigDecimal;

public class Division implements OperationBase {

	@Override
	public BigDecimal performOperation(BigDecimal left, BigDecimal right) {
		return left.divide(right);
	}

}