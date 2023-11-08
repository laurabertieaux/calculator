package controler;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import model.CalculatorModel;

public class CalculatorControler implements CalculatorControlerInterface {
	
	private CalculatorModel cal;
	//PROBLÈME À RÉSOUDRE 
	private Label label1 ; 
	public Label label2 ;
	public Label label3 ;
	public Label label4 ;
	public Label label5 ;
	
	/**
	 * 
	 */
	public CalculatorControler() {
		 cal = new CalculatorModel();
		 label1  = new Label("Initial Text");
		 label2 = new Label("Initial Text");
		 label3 = new Label("Initial Text");
		 label4 = new Label("Initial Text");
		 label5 = new Label("Initial Text");	
	}

	@Override
	
	public void change(String accu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * @param event action du bouton "."
	 */
	public void pts (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + ".";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "1"
	 */
	public void btn1 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "1";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "2"
	 */
	public void btn2 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "2";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "3"
	 */
	public void btn3 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "3";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "4"
	 */
	public void btn4 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "4";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "5"
	 */
	public void btn5 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "5";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "6"
	 */
	public void btn6 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "6";
		cal.setaccu(ac);		
		label5.setText(ac);
	}

	/**
	 * 
	 * @param event action du bouton "7"
	 */
	public void btn7 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "7";
		cal.setaccu(ac);		
		label5.setText(ac);
	}

	/**
	 * 
	 * @param event action du bouton "8"
	 */
	public void btn8 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "8";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "9"
	 */
	public void btn9 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "9";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "0"
	 */
	public void btn0 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "0";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	/**
	 * 
	 * @param event action du bouton "*"
	 * c'est la multiplication
	 */
	public void mult (ActionEvent event) {
		cal.multiply();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "/"
	 * c'est la division
	 * on affiche un texte d'erreur en cas de division par 0
	 */
	public void div (ActionEvent event) {
		if (cal.peek()==0) {
			label5.setText("Erreur : division par 0 impossible");
		}
		else {
			cal.divide();
			entrons();
		}
	}
	
	/**
	 * 
	 * @param event action du bouton "+"
	 * c'est l'addition
	 */
	public void sum (ActionEvent event) {
		cal.add();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "/"
	 * c'est la soustraction
	 */
	public void subs (ActionEvent event) {
		cal.substract();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "(-)"
	 * c'est l'opposé
	 */
	public void oppo (ActionEvent event) {
		cal.opposite();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "enter"
	 * on rentre la valeur de l'accumulateur dans a pile
	 */
	public void enter (ActionEvent event) {
		cal.push();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "AC"
	 * on efface toute la pile
	 */
	public void clean (ActionEvent event) {
		cal.clear();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "<>"
	 * on permute les 2 dernieres valeurs de la pile
	 */
	public void swop (ActionEvent event) {
		cal.swap();
		entrons();
	}
	
	/**
	 * 
	 * @param event action du bouton "bye"
	 * on efface la derniere valeur de la pile
	 */
	public void bye (ActionEvent event) {
		cal.drop();
		entrons();
	}
	
	/**
	 * on affiche les dernieres valeurs dela 
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
 
}
