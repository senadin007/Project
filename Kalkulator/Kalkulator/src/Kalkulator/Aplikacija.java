package Kalkulator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplikacija extends Application {

	@Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        root.setStyle("-fx-background-color: BLACK;");

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Kalkulator");
        primaryStage.show();
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
