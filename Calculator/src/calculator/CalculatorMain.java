package calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorModel a = new CalculatorModel();
		
		a.push(0);
		a.push(0.5);
		a.push(90);
		
		a.add(); 
		Double b = a.pop();
		System.out.println(b);
	}

}
