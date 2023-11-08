package model;


import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {

	private String accu;
	private Stack<Double> pile;

	/**
	 *  Constructeur par défaut qui crée une pile vide et un accumulateur vide 
	 */
	public CalculatorModel() { 
		pile = new Stack<Double>();
		pile.push(null); //on ajoute 2 valeur null a la pile pour aier a verifier si elle est vide
		pile.push(null);
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
	 * Récupère la pile 
	 * @return la pile
	 */
	public Stack<Double> getpile(){
		return pile;
	}

	/**
	 * Change la valeur de l'accumulateur
	 * @param accu la nouvelle valeur de l'accumulateur
	 */
	public void setaccu(String accu) {
		this.accu = accu;
	}

	/**
	 * On verifie si la pile contient au moins 2 valeurs
	 * @return un boolean indiquant s'il y a assez de valeur pour effectuer l'opération
	 */
	public boolean check() {
		boolean vf;
		if (pile.peek()==null) { //on verifie si la pile contient au moins une valeur
			vf = false;
		}else {
			Double a;
			a = pile.pop(); //on recupere cette valeur pour verifier les suivantes
			if (pile.peek()==null) { //on verifie si la pile contient une deuxieme valeur
				vf = false;
			}else {
				vf=true;
			}
			pile.push(a); // on reinjecte la premiere valeur
		}
		return vf;
	}

	
	/**
	 * Sommer les deux premiers nombres dans la pile
	 */
	@Override
	public void add() {

		if (check()) {
			Double a;
			a = pile.pop();
			Double b;
			b = pile.pop();
			pile.push(a+b);
		}
	}

	/**
	 * Soustrait les deux premiers nombres de la pile
	 */
	@Override
	public void substract() {

		if (check()) {
			double a;
			double b;
			a = pile.pop();
			b = pile.pop();
			pile.push(b-a);
		}
	}

	/**
	 * Multiplie les deux premiers nombres de la pile
	 */
	@Override
	public void multiply() {

		if (check()) {
			double a;
			double b;
			a = pile.pop();
			b = pile.pop();
			pile.push(a*b);
		}
	}

	/**
	 * Divise les deux premiers nombre de la pile
	 */
	@Override
	public void divide() {

		if (check()) {
			double a;
			double b;
			a = pile.pop();
			b = pile.pop();
			if (a!=0) { 		//vérification : le dénominateur doit être différent de 0
				pile.push(b/a); //réinjecte le résultat de la division dans la pile

			}
			else {
				pile.push(b); //sinon on réinjecte les valeurs précédentes dans la pile
				pile.push(a);
			}	
		}
	}

	/**
	 * Calcul l'opposé du premier nombre de la pile
	 */
	@Override
	public void opposite() {

		if (pile.peek()!=null) { //on verifie si la pile n'est pas vide
			double a;
			a = pile.pop();
			pile.push(-1*a);
		}
	}

	/**
	 * Injecte la valeur de l'accumulateur dans la pile
	 */
	@Override
	public void push() {

		Double d = Double.valueOf(accu); //on convertie l'accumulateur en Double
		pile.push(d);	
	}

	/**
	 * Permet d'extraire le premier nombre de la pile
	 */
	@Override
	public Double pop() {
		if(pile.empty()) {  //on verifie que la pile n'est pas vide
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
		Double a = pile.pop(); //on recupere la derniere valeur pour la supprimer
	}

	/**
	 * Échange les deux premiers nombres de la pile
	 */
	@Override
	public void swap() {

		if (check()) {
			double a;
			double b;
			a = pile.pop();
			b = pile.pop();
			pile.push(a);
			pile.push(b);
		}
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


}
