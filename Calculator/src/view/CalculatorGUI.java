package view;

import java.util.List;
import javafx.application.Application ;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

 
public class CalculatorGUI {
	
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

	

   
 

}