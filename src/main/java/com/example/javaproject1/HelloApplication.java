package com.example.javaproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("demo.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("test1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        primaryStage.setTitle("Заметки");
//        primaryStage.setScene(new Scene(root, 800, 800));
//        primaryStage.show();
//    }

    public static void main(String[] args) {
        launch();
    }
}