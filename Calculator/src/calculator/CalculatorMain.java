package calculator;

import model.CalculatorModel;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorModel pile = new CalculatorModel();
		
		pile.push();
		pile.push();
		pile.push();
		
		pile.add(); 
		Double b = pile.pop();
		System.out.println(b);
	}

}
