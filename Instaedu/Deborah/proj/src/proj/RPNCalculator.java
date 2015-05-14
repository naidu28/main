package proj;
import java.util.Scanner;

public class RPNCalculator {
	public static void main(String[] args) {
		// this method should collect a mathematical expression in Reverse Polish Notation (RPN) from the user
		// the entire expression is entered as single input
		// it will consist of integers and operators, +, -, *, /, ^
		// each part of the expression will be separated by a space
		
		// use nextLine to get the entirety of the expression
		// it should break up the expression into individual parts by
		// using the string's split method
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a postfix expression: \n> ");
		
		String userInput = input.nextLine();
		String[] separate = userInput.split(" ");
		StackOfDoubles stack = new StackOfDoubles();
		String operators = "+-*/^";
		
		for (int i = 0; i < separate.length; i++) {
			if (!operators.contains(separate[i])) {
				stack.push(Double.parseDouble(separate[i]));
			}
			else {
				if (separate[i] == "+") {
				    double val1 = stack.pop();
				    double val2 = stack.pop();
				    double newValue = val1 + val2;
				    stack.push(newValue);

				}
				else if (separate[i] == "-") {
				    double val1 = stack.pop();
				    double val2 = stack.pop();
				    double newValue = val1 - val2;
				    stack.push(newValue);
				}
				else if (separate[i] == "*") {
				    double val1 = stack.pop();
				    double val2 = stack.pop();
				    double newValue = val1 * val2;
				    stack.push(newValue);
				}
				else if (separate[i] == "/") {
				    double val1 = stack.pop();
				    double val2 = stack.pop();
				    double newValue = val1 / val2;
				    stack.push(newValue);
				}
				else if (separate[i] == "^") {
				    double val1 = stack.pop();
				    double val2 = stack.pop();
				    double newValue = Math.pow(val1, val2);
				    stack.push(newValue);
				}		
			}
			
			String s = String.format("Processing token: '%s', stack = %s", separate[i], String.valueOf(stack.toString()));
			System.out.println(s);
		}
		
		
	}

}
