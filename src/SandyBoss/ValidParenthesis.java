package SandyBoss;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String [] args) {
		String s = "[{()]";
		System.out.println(validP(s));
	}
	public static boolean validP(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c=='(') {
				stack.push(')');
			}
			else if(c=='{') {
				stack.push('}');
			}
			else if(c=='[') {
				stack.push(']');
			}
			else {
				if(stack.isEmpty() || stack.pop()!=c) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
