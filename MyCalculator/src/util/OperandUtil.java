package util;

import java.util.HashMap;
import java.util.Map;

import operation.Addition;
import operation.Division;
import operation.Multiplication;
import operation.OperationBase;
import operation.Subtraction;

/**
 * This helper class is used to initialize following maps when class is loaded:
 * 
 * operationHandlerMap -> Maintains mapping between operator and handler class object (e.g. "+" maps to Addition class object)
 * operationPrecedenceMap --> Maintains Operator to precedence mapping.
 * 
 *
 *
 */
public class OperandUtil {
	
	public static final Map<String, OperationBase>  operationHandlerMap = new HashMap<String, OperationBase>();

	public static final Map<String, Integer> operationPrecedenceMap = new HashMap<String, Integer>();

	static {

		operationHandlerMap.put("*" , new Multiplication());
		operationHandlerMap.put("+" , new Addition());
		operationHandlerMap.put("/" , new Division());
		operationHandlerMap.put("-" , new Subtraction());
		
		operationPrecedenceMap.put("*" , 5);
		operationPrecedenceMap.put("/" , 5);
		operationPrecedenceMap.put("-" , 1);
		operationPrecedenceMap.put("+" , 1);

	}
}
