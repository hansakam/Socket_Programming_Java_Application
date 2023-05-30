/**
 * @author :Hansaka Malshan
 * created 5/30/2023---1:22 AM
 */
package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginForm03Controller {
    @FXML
    private AnchorPane LoginFormPaneC3;

    @FXML
    private JFXTextField txtcname;

    public static String name;

    @FXML
    void btnloginonAction(ActionEvent event) throws IOException {
        name = txtcname.getText();
        LoginFormPaneC3.getChildren().clear();
        Stage stage = (Stage) LoginFormPaneC3.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm03.fxml"))));

    }

}
