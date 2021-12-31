package com.example.test_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override

    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.setTitle("Лучший в мире чат");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}