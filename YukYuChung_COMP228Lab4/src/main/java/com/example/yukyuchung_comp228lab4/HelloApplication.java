package com.example.yukyuchung_comp228lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Image icon = new Image("https://upload.wikimedia.org/wikipedia/en/c/cc/JavaFX_Logo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Student Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}