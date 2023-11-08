package controler;

import java.util.List;

public interface CalculatorControlerInterface {
	
	/**
	 * Méthode que nous avons choisi de ne pas utiliser dans notre projet
	 * Nous pensons quelle permet de mettre à jour la valeur de l'accumulateur
	 * @param accu nouvelle valeur de l'accumulateur
	 */
	public void change(String accu);
	
	/**
	 * Méthode que nous avons choisi de ne pas utiliser dans notre projet
	 * Nous pensons quelle permet de mettre à jour la valeur de la pile
	 * @param stackData nouvelle valeur de la pile
	 */
	public void change(List<Double> stackData);
 
}
