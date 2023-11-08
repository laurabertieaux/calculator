package controler;

import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import model.CalculatorModel;

public class CalculatorControler implements CalculatorControlerInterface {

	private CalculatorModel cal;
	
	/**
	 * Ici il y a un problème d'encapsulation que nous avons identifié. 
	 * Lorsque les labels sont "private" les chiffres correspondant aux boutons sur lesquels on vient de cliquer n'apparaissent pas dans les labels. 
	 * En revanche les chiffres sont stockés dans la valeur de l'accumulateur.
	 * Le problème semble venir du lien entre sample.fxml et CalculatorControler.
	 * CalculatorControler peut actualiser les valeurs des label mais sample.fxml n'arrive pas à récuperer cette valeur pour l'afficher.
	 * Nous avons essayé de le résoudre en utilisant :
	 * - des getters et setters -> leur utilisation nous a semblé inutile dans sample.fxml et aucune autre classe n'utilise les Labels 
	 * - des TextField à la place des Label -> le problème était le même
	 * - l'importation du package controler dans sample.fxml mais les attributs restent privés -> le problème ne change pas
	 */
	public Label label1 ; 
	public Label label2 ;
	public Label label3 ;
	public Label label4 ;
	public Label label5 ;

	/**
	 * Constructeur de la classe CalculatorControler 
	 * On créer un nouveau CalculatorModel 
	 * Ainsi que des nouveaux label : les 5 labels correspondent au 5 zones de notre calculatrice (accumulateur...)
	 */
	public CalculatorControler() {
		cal = new CalculatorModel();
		label1 = new Label("Initial Text");
		label2 = new Label("Initial Text");
		label3 = new Label("Initial Text");
		label4 = new Label("Initial Text");
		label5 = new Label("Initial Text");	
	}


	/**
	 * Écrire des nombres à virgule
	 * @param event action du bouton "."
	 */
	public void pts (ActionEvent event) {
		btn(".");
	}

	/**
	 * Ajouter 1 dans l'accumulateur
	 * @param event action du bouton "1"
	 */
	public void btn1 (ActionEvent event) {
		btn("1");
	}

	/**
	 * Ajouter 2 dans l'accumulateur
	 * @param event action du bouton "2"
	 */
	public void btn2 (ActionEvent event) {
		btn("2");
	}

	/**
	 * Ajouter 3 dans l'accumulateur
	 * @param event action du bouton "3"
	 */
	public void btn3 (ActionEvent event) {
		btn("3");
	}

	/**
	 * Ajouter 4 dans l'accumulateur
	 * @param event action du bouton "4"
	 */
	public void btn4 (ActionEvent event) {
		btn("4");
	}

	/**
	 * Ajouter 5 dans l'accumulateur
	 * @param event action du bouton "5"
	 */
	public void btn5 (ActionEvent event) {
		btn("5");
	}

	/**
	 * Ajouter 6 dans l'accumulateur
	 * @param event action du bouton "6"
	 */
	public void btn6 (ActionEvent event) {
		btn("6");
	}

	/**
	 * Ajouter 7 dans l'accumulateur
	 * @param event action du bouton "7"
	 */
	public void btn7 (ActionEvent event) {
		btn("7");
	}

	/**
	 * Ajouter 8 dans l'accumulateur
	 * @param event action du bouton "8"
	 */
	public void btn8 (ActionEvent event) {
		btn("8");
	}

	/**
	 * Ajouter 9 dans l'accumulateur
	 * @param event action du bouton "9"
	 */
	public void btn9 (ActionEvent event) {
		btn("9");
	}

	/**
	 * Ajouter 0 dans l'accumulateur
	 * @param event action du bouton "0"
	 */
	public void btn0 (ActionEvent event) {
		btn("0");
	}

	/**
	 * c'est la multiplication
	 * @param event action du bouton "*"
	 */
	public void mult (ActionEvent event) {
		cal.multiply();
		entrons();
	}

	/**
	 * c'est la division
	 * on affiche un texte d'erreur en cas de division par 0
	 * @param event action du bouton "/"
	 */
	public void div (ActionEvent event) {
		if(cal.peek()==null) {
			System.out.println("licorne");
		}else {
			if (cal.peek()==0.) {
				label5.setText("Erreur : division par 0 impossible");
			}
			else {
				cal.divide();
				entrons();
			}}

	}

	/**
	 * c'est l'addition
	 * @param event action du bouton "+"
	 */
	public void sum (ActionEvent event) {
		cal.add();
		entrons();
	}

	/**
	 * c'est la soustraction
	 * @param event action du bouton "/"
	 */
	public void subs (ActionEvent event) {
		cal.substract();
		entrons();
	}

	/**
	 * c'est l'opposé
	 * @param event action du bouton "(-)"
	 */
	public void oppo (ActionEvent event) {
		cal.opposite();
		entrons();
	}

	/**
	 * on rentre la valeur de l'accumulateur dans la pile
	 * @param event action du bouton "enter"
	 */
	public void enter (ActionEvent event) {
		cal.push();
		entrons();
	}
	
	/**
	 * on supprime entierement l'accumulateur
	 * @param event action du bouton "delete"
	 */
	public void delete (ActionEvent event) {
		cal.setaccu("");
		entrons();
	}

	/**
	 * on efface toute la pile
	 * @param event action du bouton "AC"
	 */
	public void clean (ActionEvent event) {
		cal.clear();
		entrons();
	}

	/**
	 * on permute les 2 dernieres valeurs de la pile
	 * @param event action du bouton "<>"
	 */
	public void swop (ActionEvent event) {
		cal.swap();
		entrons();
	}

	/**
	 * on efface la derniere valeur de la pile
	 * @param event action du bouton "bye"
	 */
	public void bye (ActionEvent event) {
		cal.drop();
		entrons();
	}

	/**
	 * Affichage des dernières valeurs de la pile dans les labels 
	 */
	public void entrons() {
		cal.setaccu("");
		Double x4 = cal.pop();
		Double x3 = cal.pop();
		Double x2 = cal.pop();
		Double x1 = cal.pop();
		String X4 = String.valueOf(x4);
		String X3 = String.valueOf(x3);
		String X2 = String.valueOf(x2);
		String X1 = String.valueOf(x1);
		label5.setText("");
		label4.setText(X4);
		label3.setText(X3);
		label2.setText(X2);
		label1.setText(X1);
		cal.pushing(x1);
		cal.pushing(x2);
		cal.pushing(x3);
		cal.pushing(x4);
	}

	/**
	 * Méthode globale qui ajoute à l'accumulateur la valeur du bouton sur lequel on vient de cliquer
	 * @param val valeur du bouton sur lequel on vient de cliquer 
	 */
	public void btn(String val) {
		String ac = cal.getaccu();
		ac = ac + val;
		cal.setaccu(ac);		
		label5.setText(ac);
	}

	@Override
	public void change(List<Double> stackdata) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void change(String accu) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}


