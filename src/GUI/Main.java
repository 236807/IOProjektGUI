package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static Stage stg;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        primaryStage.setTitle("Rental");
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
