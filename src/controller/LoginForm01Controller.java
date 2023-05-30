/**
 * @author :Hansaka Malshan
 * created 5/23/2023---8:01 PM
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

public class LoginForm01Controller {
    @FXML
    private AnchorPane LoginFormPaneC1;

    @FXML
    private JFXTextField txtcname;
    public static String name;

    @FXML
    void btnloginonAction(ActionEvent event) throws IOException {
        name = txtcname.getText();
        LoginFormPaneC1.getChildren().clear();
        Stage stage = (Stage) LoginFormPaneC1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientForm01.fxml"))));
    }

}
