package org.example.javafxbasic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class Scene1Controller {

    @FXML
    TextField nameTextField;

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void login(ActionEvent event) throws Exception {
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));

        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
