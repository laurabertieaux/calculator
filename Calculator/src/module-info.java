/**
 * 
 */
module Calculator { 
	exports calculator; // 
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	opens view to javafx.graphics, javafx.fxml ; // fait le lien entre le package view, javafx.fxml et javafx.graphics (qui gère les événements graphiques comme les interactions entre l'utilisateur et l'interface graphique 
	opens controler to javafx.fxml; // fait le lien entre le package controler et javafx.fxml (langage pour décrire l'interface graphique)
}