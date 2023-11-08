package calculator;

import javafx.application.Application;
import javafx.stage.Stage;
import view.CalculatorGUI;

public class CalculatorMain extends Application {
	
	 public void start(Stage primaryStage) throws Exception {
		 CalculatorGUI st = new CalculatorGUI(primaryStage);
		 st.go();
		 
	 }
 
	 public static void main(String[] args) {
	        launch(args);
	    }
	 

}
