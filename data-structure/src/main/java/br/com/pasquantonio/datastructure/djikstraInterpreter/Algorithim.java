package br.com.pasquantonio.datastructure.djikstraInterpreter;
import java.util.Stack;

/**
 * it uses stacks to store the operations and values, and push or pop it acordiong to the element.
 * This  Algorithim is usually used by interpretor de interpret expressions
 * @author vn0emnu
 *
 */
public class Algorithim {

	private Stack<String> operationStack;
	private Stack<Double> valueStack;

	public Algorithim() {
		this.operationStack = new Stack<String>();
		this.valueStack = new Stack<Double>();
	}

	public void interpretExpression(String expression) {
		String[] expressions = expression.split(" ");

		for (String element : expressions) {
			if (element.equals("(")) {

			} else if (element.equals("*")) {
				this.operationStack.push(element);
			} else if (element.equals("+")) {
				this.operationStack.push(element);
			} else if (element.equals(")")){
				String operation = this.operationStack.pop();
				if(operation.equals("*")){
					this.valueStack.push(this.valueStack.pop()*this.valueStack.pop());
				}else if( operation.equals("+")){
					this.valueStack.push(this.valueStack.pop()+this.valueStack.pop());
				}
			}else{
				this.valueStack.push(Double.parseDouble(element));
			}

		}

	}
	public void result(){
		System.out.println("Resul: "+ this.valueStack.pop());
	}
}
