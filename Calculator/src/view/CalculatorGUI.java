package view;

import java.util.List;
import javafx.application.Application ;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 


public class CalculatorGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
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

    public static void main(String[] args) {
        launch(args);
    }


}