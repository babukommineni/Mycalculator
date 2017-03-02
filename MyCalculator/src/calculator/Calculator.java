package calculator;

import static util.ExpressionUtil.convertExpressionToRPN;
import static util.OperandUtil.operationHandlerMap;
import static util.OperatorUtil.isOperator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import operation.OperationBase;

/**
 * This class implements CalculatorBase interface which has method
 * calculate(String exp). This method takes in an expression and computes the
 * value of the expression. *
 * 
 *
 *
 */
public class Calculator implements CalculatorBase {

	private static final String regex = " ";
	private static Scanner scanner;

	@Override
	public BigDecimal calculate(String expression) {
		if (expression == null || expression.isEmpty()) {
			return null;
		}
		
		List<String> rpnList = convertExpressionToRPN(expression.split(regex));

		return evaluateRPNExpression(rpnList);
	}

	/**
	 * Computes value of (left operator right) where 'left' and 'right' are
	 * operands and 'operator' is an Operator, could be binary or custom.
	 *
	 */
	public static BigDecimal performOperation(String op, BigDecimal left,
			BigDecimal right) {
		OperationBase operationHandler = operationHandlerMap.get(op);
		return operationHandler.performOperation(left, right);
	}

	public static BigDecimal evaluateRPNExpression(List<String> rpnList) {
		Stack<BigDecimal> stack = new Stack<BigDecimal>();

		for (String token : rpnList) {
			if (!isOperator(token)) {
				stack.push(new BigDecimal(token));
			} else {
				BigDecimal obj2 = stack.pop();
				BigDecimal obj1 = stack.pop();

				BigDecimal result = performOperation(token, obj1, obj2);

				stack.push(result);
			}
		}

		return stack.pop();
	}

	
	public static void main(String[] args) {
		 scanner = new Scanner(System.in);
		 String expression = scanner.nextLine();
		System.out.println(convertExpressionToRPN((expression).split(" ")));
		System.out.println(convertExpressionToRPN((expression).split(" ")));
Calculator c = new Calculator();
System.out.print(c.calculate(expression));

	}
}
