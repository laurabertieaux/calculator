package calculator;

import javafx.application.Application;
import javafx.stage.Stage;
import view.CalculatorGUI;

public class CalculatorMain extends Application {
	
	 /**
	  * Lancement de la calculatrice 
	  */
	 public void start(Stage primaryStage) throws Exception {
		 CalculatorGUI st = new CalculatorGUI(primaryStage); //création d'un nouveau CalculatorGUI
		 st.go();	 										 //appel de la méthode contenu dans CalculatorGUI
	 }
 
	 public static void main(String[] args) {
	        launch(args);
	    }
	 

}
