package org.example.javafxbasic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon-test.jpeg")));
        stage.getIcons().add(icon);

        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.setFullScreen(true);

        stage.setFullScreenExitHint("You ca't escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}