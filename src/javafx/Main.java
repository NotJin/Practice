package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage rootStage;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("book/bookstore.fxml"));
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
