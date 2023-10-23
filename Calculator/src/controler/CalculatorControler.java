package controler;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import model.CalculatorModel;

public class CalculatorControler implements CalculatorControlerInterface {
	
	private CalculatorModel cal;
	public Label didi = new Label("Initial Text");
	public Label label2 = new Label("Initial Text");
	public Label label3 = new Label("Initial Text");
	public Label label4 = new Label("Initial Text");
	public Label label5 = new Label("Initial Text");

	@Override
	public void change(String accu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(List<Double> stackData) {
		// TODO Auto-generated method stub
		
	}
	public void btn1 (ActionEvent event) {
		//Double ac = cal.getaccu();
		//ac = ac*10 + 1;
		//cal.setaccu(ac);		
		didi.setText("coucoi");
		label2.setText("aaaaa");
	}
	
	public void btn2 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 2;
		cal.setaccu(ac);
	}
	
	public void btn3 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 3;
		cal.setaccu(ac);
	}
	
	public void btn4 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 4;
		cal.setaccu(ac);
	}
	
	public void btn5 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 5;
		cal.setaccu(ac);
	}
	
	public void btn6 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 6;
		cal.setaccu(ac);
	}

	public void btn7 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 7;
		cal.setaccu(ac);
	}

	public void btn8 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 8;
		cal.setaccu(ac);
	}
	
	public void btn9 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10 + 9;
		cal.setaccu(ac);
	}
	
	public void btn0 (ActionEvent event) {
		Double ac = cal.getaccu();
		ac = ac*10;
		cal.setaccu(ac);
	}
	
	public void mult (ActionEvent event) {
		cal.multiply();
	}
	
	public void div (ActionEvent event) {
		cal.divide();
	}
	
	public void sum (ActionEvent event) {
		cal.add();
	}
	
	public void subs (ActionEvent event) {
		cal.substract();
	}
	
	public void oppo (ActionEvent event) {
		cal.opposite();
	}
	
	public void enter (ActionEvent event) {
		cal.push();
	}
	
	public void clean (ActionEvent event) {
		cal.clear();
	}
	
	public void swop (ActionEvent event) {
		cal.swap();
	}
	
	public void bye (ActionEvent event) {
		cal.drop();
	}

}
