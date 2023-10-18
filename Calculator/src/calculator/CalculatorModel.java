package calculator;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	

	private  Double accu;
	private Stack<Double> pile;
	
	 // Constructeur par défaut qui crée une pile vide

    public CalculatorModel() { 
        pile = new Stack<Double>();
        accu = 0.0 ;
    }
        

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Double a;
		Double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(a+b);
		
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(b-a);
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(a*b);
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(b/a);
	}

	@Override
	public void opposite() {
		// TODO Auto-generated method stub
		double a;
		a = pile.pop();
		pile.push(-1*a);
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		pile.push(accu);
	}

	@Override
	public Double pop() {
		return pile.pop();
	}

	@Override
	public void drop() {
		Double a;
		a = pile.pop();
	}

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(a);
		pile.push(b);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		pile.clear();
	}
	
}
