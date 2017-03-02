package util;

import static util.OperatorUtil.hasPrecedence;
import static util.OperatorUtil.isOperator;

import java.util.ArrayList;
import java.util.Stack;


/**
 * This class is helper class to convert a mathematical expression into RPN String.
 * for eg.
 * 2 * 4 + 5 + 8
 * 
 * will be converted to:
 * [2, 4, *, 5, +, 8, +]
 *  
 *  
 *
 *
 */
public class ExpressionUtil {

	public static ArrayList<String> convertExpressionToRPN(String[] inputTokens) {
		ArrayList<String> rpnList = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();

		for (String token : inputTokens) {
			if (isOperator(token)) {
		
				while (!stack.empty() && isOperator(stack.peek())) {
					if (!hasPrecedence(token, stack.peek())) {
						rpnList.add(stack.pop());
						continue;
					}
					break;
				}
				// Push the new operator on the stack
				stack.push(token);
			}
			// If token is a left bracket '('
			else if (token.equals("(")) {
				stack.push(token); //
			}
			// If token is a right bracket ')'
			else if (token.equals(")")) {
				while (!stack.empty() && !stack.peek().equals("(")) {
					rpnList.add(stack.pop());
				}
				stack.pop();
			}
			// If token is a non operator/number
			else {
				rpnList.add(token);
			}
		}
		while (!stack.empty()) {
			rpnList.add(stack.pop());
		}

		return rpnList;
	}

	 
}
