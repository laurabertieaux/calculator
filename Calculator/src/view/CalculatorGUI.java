package view;


import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 


public class CalculatorGUI implements CalculatorGUIInterface{

	private Stage primaryStage;

	public CalculatorGUI(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public void go() throws Exception{
		// Charger le fichier FXML
		FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
		Parent root = loader.load();

		// Créer la scène
		Scene scene = new Scene(root);

		// Configurer la scène et afficher la fenêtre
		primaryStage.setTitle("Calculatrice");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void change(List<Double> stackdata) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void change(String accu) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void affiche() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}