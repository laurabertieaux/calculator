package model;

import java.util.Stack;

import controler.CalculatorControler;
import javafx.scene.control.Label;

public class CalculatorModel implements CalculatorModelInterface {
	

	private String accu;
	private Stack<Double> pile;
	public Label label5 = new Label("Initial Text");
	
/**
 *  Constructeur par défaut qui crée une pile vide et un accumulateur vide 
 */
	public CalculatorModel() { 
        pile = new Stack<Double>();
        accu = "" ;
    }

	/**
	 * 
	 * @return la valeur de l'acculmulateur 
	 */
	public String getaccu() {
		return accu;
	}
	
	public void setaccu(String accu) {
		this.accu = accu;
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
	public Double divide() {
		// TODO Auto-generated method stub
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		if (a!=0) {
			pile.push(b/a);
			return 1. ;
		}
		else {
			return 0.;
		}
		
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
		//if (accu != null) {
		Double d = Double.valueOf(accu);
			pile.push(d);	
		//}
	}

	@Override
	public Double pop() {
		if(pile.empty()) {
			return null;
		}else {
			return pile.pop();
		}
		
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
		accu = "";
	}
	
	public void pushing(Double a) {
			pile.push(a);	

	}

	public Double peek() {
		// TODO Auto-generated method stub
		return pile.peek();
	}
	
}
