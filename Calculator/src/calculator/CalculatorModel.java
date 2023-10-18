package calculator;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	
	private  Stack<Double> accu;
	
	 // Constructeur par défaut qui crée une pile vide
    public CalculatorModel() {
       // accu = 0.0;
       // pile = new Stack<Double>();
    }

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Double a;
		Double b;
		a = accu.pop();
		b = accu.pop();
		accu.push(a+b);
		
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = accu.pop();
		b = accu.pop();
		accu.push(b-a);
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = accu.pop();
		b = accu.pop();
		accu.push(a*b);
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = accu.pop();
		b = accu.pop();
		accu.push(b/a);
	}

	@Override
	public void opposite() {
		// TODO Auto-generated method stub
		double a;
		a = accu.pop();
		accu.push(-1*a);
	}

	@Override
	public void push(double a) {
		// TODO Auto-generated method stub
		accu.push(a);
	}

	@Override
	public Double pop() {
		return accu.pop();
	}

	@Override
	public void drop() {
		Double a;
		
		a = accu.pop();
	}

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = accu.pop();
		b = accu.pop();
		accu.push(a);
		accu.push(b);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		accu.clear();
	}
	
}
