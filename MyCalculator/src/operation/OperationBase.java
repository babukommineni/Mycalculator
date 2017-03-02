package operation;

import java.math.BigDecimal;

/**
 * Base class for Binary Operation. This class is implemented to implement Binary Operations like Addition, Multiplication etc.
 * 
 * Scope of extension:
 * 
 * Custom operations could also be supported by implementing this class for custom operators.
 * 
 * 
 *
 */
public interface OperationBase {

	public BigDecimal performOperation(BigDecimal left, BigDecimal right);

}
