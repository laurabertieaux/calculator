/**
 * 
 */
/**
 * 
 */
module Calculator {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	opens view to javafx.graphics, javafx.fxml ;
	//opens controler to javafx.fxml;
}