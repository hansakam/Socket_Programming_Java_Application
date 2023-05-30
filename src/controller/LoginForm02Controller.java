/**
 * @author :Hansaka Malshan
 * created 5/30/2023---1:20 AM
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
import java.net.URL;
import java.util.ResourceBundle;

public class LoginForm02Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane LoginFormPaneC2;

    @FXML
    private JFXTextField txtcname;
    public static String name;
    @FXML
    void btnloginonAction(ActionEvent event) throws IOException {
        name = txtcname.getText();
        LoginFormPaneC2.getChildren().clear();
        Stage stage = (Stage) LoginFormPaneC2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm02.fxml"))));
    }
}
