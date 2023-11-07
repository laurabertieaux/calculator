package controler;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import model.CalculatorModel;

public class CalculatorControler implements CalculatorControlerInterface {
	
	private CalculatorModel cal = new CalculatorModel();
	public Label label1 = new Label("Initial Text");
	public Label label2 = new Label("Initial Text");
	public Label label3 = new Label("Initial Text");
	public Label label4 = new Label("Initial Text");
	public Label label5 = new Label("Initial Text");
	
	public CalculatorControler() {
		
	}

	@Override
	public void change(String accu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		
	}
	
	public void pts (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + ".";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn1 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "1";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn2 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "2";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn3 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "3";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn4 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "4";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn5 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "5";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn6 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "6";
		cal.setaccu(ac);		
		label5.setText(ac);
	}

	public void btn7 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "7";
		cal.setaccu(ac);		
		label5.setText(ac);
	}

	public void btn8 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "8";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn9 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "9";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void btn0 (ActionEvent event) {
		String ac = cal.getaccu();
		ac = ac + "0";
		cal.setaccu(ac);		
		label5.setText(ac);
	}
	
	public void mult (ActionEvent event) {
		cal.multiply();
		entrons();
	}
	
	public void div (ActionEvent event) {
		if (cal.peek()==0) {
			label5.setText("Erreur : division par 0 impossible");
		}
		else {
			cal.divide();
			entrons();
		}
	}
	
	public void sum (ActionEvent event) {
		cal.add();
		entrons();
	}
	
	public void subs (ActionEvent event) {
		cal.substract();
		entrons();
	}
	
	public void oppo (ActionEvent event) {
		cal.opposite();
		entrons();
	}
	
	public void enter (ActionEvent event) {
		cal.push();
		entrons();
	}
	
	public void clean (ActionEvent event) {
		cal.clear();
		entrons();
	}
	
	public void swop (ActionEvent event) {
		cal.swap();
		entrons();
	}
	
	public void bye (ActionEvent event) {
		cal.drop();
		entrons();
	}
	
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
