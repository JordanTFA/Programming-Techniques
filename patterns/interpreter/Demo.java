package interpreter;

/* https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 * 
 * Interpreter pattern provides a way to evaluate language grammar 
 * or expression. This type of pattern comes under behavioral 
 * pattern. This pattern involves implementing an expression 
 * interface which tells to interpret a particular context. 
 * This pattern is used in SQL parsing, symbol processing engine etc.
 */

public class Demo {
	
	// Rule: Robert and John are male
	public static Expression getMaleExpression(){
		
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		
		return new OrExpression(robert, john);
	}
	
	// Rule: Julia is a married woman
	public static Expression getMarriedWomanExpression(){
		
		Expression julia = new TerminalExpression("Julia");
		Expression married = new TerminalExpression("Married");
		
		return new AndExpression(julia, married);
	}

	public static void main(String[] args) {
		
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julia is married? " + isMarriedWoman.interpret("Married Julia"));

	}

}
