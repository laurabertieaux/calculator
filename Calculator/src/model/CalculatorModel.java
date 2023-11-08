package model;

import java.util.ArrayList;
import java.util.Stack;

import controler.CalculatorControler;
import javafx.scene.control.Label;

public class CalculatorModel implements CalculatorModelInterface {
	

	private String accu;
	private Stack<Double> pile;
	
/**
 *  Constructeur par défaut qui crée une pile vide et un accumulateur vide 
 */
	public CalculatorModel() { 
        pile = new Stack<Double>();
        accu = "" ;
    }

	/**
	 * Récuperer la valeur de l'accumulateur
	 * @return la valeur de l'accumulateur 
	 */
	public String getaccu() {
		return accu;
	}
	
	/**
	 * Change la valeur de l'accumulateur
	 * @param accu la nouvelle valeur de l'accumulateur
	 */
	public void setaccu(String accu) {
		this.accu = accu;
	}
        
	/**
	 * Sommer les deux premiers nombres dans la pile
	 */
	@Override
	public void add() {
		
		if (pile.peek()==null) {
			
		}else {
			Double a;
			a = pile.pop();
			if (pile.peek()==null) {
				pile.push(a);
			}else {
				Double b;
				b = pile.pop();
				pile.push(a+b);
			}
		}
	}

	/**
	 * Soustrait les deux premiers nombres de la pile
	 */
	@Override
	public void substract() {

		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(b-a);
	}

	/**
	 * Multiplie les deux premiers nombres de la pile
	 */
	@Override
	public void multiply() {
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(a*b);
	}

	/**
	 * Divise les deux premiers nombre de la pile
	 */
	@Override
	public Double divide() {

		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		if (a!=0) { 		//vérification : le dénominateur doit être différent de 0
			pile.push(b/a); //réinjecte le résultat de la division dans la pile
			return 1.;
		}
		else {
			pile.push(b); //sinon on réinjecte les valeurs précédentes dans la pile
			pile.push(a);
			return 0.;
		}	
		
	}

	/**
	 * Calcul l'opposé du dernier nombre de la pile
	 */
	@Override
	public void opposite() {

		double a;
		a = pile.pop();
		pile.push(-1*a);
	}

	/**
	 * Injecte la valeur de l'accumulateur dans la pile
	 */
	@Override
	public void push() {
		
		Double d = Double.valueOf(accu);
			pile.push(d);	
	}

	/**
	 * Permet d'extraire le premier nombre de la pile
	 */
	@Override
	public Double pop() {
		if(pile.empty()) {
			return null;
		}else {
			return pile.pop();
		}
		
	}

	/**
	 * Supprime le premier élément de la pile
	 */
	@Override
	public void drop() {
		Double a;
		a = pile.pop();
	}

	/**
	 * Échange les deux premiers nombres de la pile
	 */
	@Override
	public void swap() {
		
		double a;
		double b;
		a = pile.pop();
		b = pile.pop();
		pile.push(a);
		pile.push(b);
	}

	/**
	 * Supprime tous les nombres contenus dans la pile
	 */
	@Override
	public void clear() {
		
		pile.clear();
		accu = "";
	}
	
	/**
	 * Injecte la valeur souhaitée a dans la pile (elle est indépendante de l'accumulateur)
	 */
	public void pushing(Double a) {
			pile.push(a);	
	}

	/**
	 * Récupère la valeur du premier élément de la pile 
	 */
	public Double peek() {
	
		return pile.peek();
	}
	
	/*
	public ArrayList<Double> check() {
		ArrayList<Double> liste = new ArrayList<Double>();
		if (pile.peek()==null) {
			return null;
		}else {
			Double a;
			a = pile.pop();
			if (pile.peek()==null) {
				pile.push(a);
				return null;
			}else {
				Double b;
				b = pile.pop();
				pile.push(a+b);
				return liste;
			}
		}
		
	}
	*/
	
}
