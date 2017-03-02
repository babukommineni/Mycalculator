package operation;

import java.math.BigDecimal;

public class Addition implements OperationBase {

	@Override
	public BigDecimal performOperation(BigDecimal left, BigDecimal right) {
		return left.add(right);
	}

}
