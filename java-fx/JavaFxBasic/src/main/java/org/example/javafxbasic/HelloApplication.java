package org.example.javafxbasic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
      try {
       Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
       Scene scene = new Scene(root);

       // multiple css files
          String css = Objects.requireNonNull(this.getClass().getResource("application.css")).toExternalForm();
          scene.getStylesheets().add(css);
//          scene2.getStylesheets().add(css);

       stage.setScene(scene);
       stage.show();
      } catch (Exception e) {
       e.printStackTrace();
      }
    }

    public static void main(String[] args) {
        launch();
    }
}