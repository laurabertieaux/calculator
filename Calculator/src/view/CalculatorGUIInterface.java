package view;

import java.util.List;

public interface CalculatorGUIInterface {
	
	/**
	 * Cette méthode n'est pas implémentée dans la classe CalculatorGUI car nous avons fait le choix d'utiliser un SceneBuilder
	 * Sinon c'est elle qui permet de créer l'interface graphique
	 */
	public void affiche(); 
	
	/**
	 * Met à jour la valeur de l'accumulateur
	 * @param accu nouvelle valeur de l'accumulateur
	 * Nous avons fait le choix de ne pas utiliser cette méthode dans notre projet 
	 * setaccu() présente dans la classe CalculatorModel met à jour la valeur de l'accumulateur
	 */
	public void change(String accu);
	
	/**
	 * Met à jour la valeur de la pile 
	 * @param stackData nouvelle valeur de la pile
	 * Nous avons fait le choix de ne pas utiliser cette méthode dans notre projet
	 * La valeur de la pile est modifiée au fur et à mesure avec la méthode push()
	 */
	public void change(List<Double> stackData);
	 
}
