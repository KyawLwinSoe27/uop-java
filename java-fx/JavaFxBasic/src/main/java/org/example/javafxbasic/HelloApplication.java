package org.example.javafxbasic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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

          String css = Objects.requireNonNull(this.getClass().getResource("application.css")).toExternalForm();
          scene.getStylesheets().add(css);


       stage.setScene(scene);
       stage.show();

       stage.setOnCloseRequest(windowEvent -> {
           windowEvent.consume();;
           logout(stage);
       });
      } catch (Exception e) {
       e.printStackTrace();
      }
    }

    // exist button and Alt+4
    public void logout(Stage stage) {

        // confirmation when logout
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before existing?: ");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out;");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}