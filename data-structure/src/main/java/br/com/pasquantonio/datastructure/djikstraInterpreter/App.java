package br.com.pasquantonio.datastructure.djikstraInterpreter;

public class App {
	public static void main(String[] args) {
		Algorithim algorithim = new Algorithim();
		algorithim.interpretExpression("( 3 + 3 ) * ( 4 + 2 ) )");
		algorithim.result();
	}
}
