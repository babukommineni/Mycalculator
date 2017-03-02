package util;

import static util.OperandUtil.operationHandlerMap;
import static util.OperandUtil.operationPrecedenceMap;
/**
 * 
 * 
 *
 */
public class OperatorUtil {

	
	public static boolean hasPrecedence(String op1, String op2) {
		if(!(operationPrecedenceMap.containsKey(op1)&& operationPrecedenceMap.containsKey(op2))){
			throw new IllegalArgumentException();
		}
		return (operationPrecedenceMap.get(op1) - operationPrecedenceMap.get(op2))>0;

	}
	
	public static boolean isOperator(String token) {
		return operationHandlerMap.containsKey(token);
	}
}

