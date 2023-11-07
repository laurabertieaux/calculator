/**
 * 
 */
/**
 * 
 */
module Calculator { 
	exports calculator;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	opens view to javafx.graphics, javafx.fxml ;
	opens controler to javafx.fxml; 
}