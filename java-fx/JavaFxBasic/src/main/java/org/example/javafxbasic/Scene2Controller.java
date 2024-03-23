package org.example.javafxbasic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller {
    @FXML
    Label nameLabel;

    @FXML
    private Button logoutBtn;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void displayName(String username) {
        nameLabel.setText("Hello: " + username);
    }

    public void logout(ActionEvent event) {

        // confirmation when logout
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before existing?: ");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            System.out.println("You successfully logged out;");
            stage.close();
        }
    }
}
