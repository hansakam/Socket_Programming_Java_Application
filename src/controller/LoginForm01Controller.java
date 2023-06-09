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
    public JFXTextField txtUserName;
    @FXML
    private AnchorPane LoginFormPaneC1;


    public static String name;
    public static String userName;

    @FXML
    void btnloginonAction(ActionEvent event) throws IOException {
        userName =txtUserName.getText();
        Stage stage = (Stage) txtUserName.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ClientForm01.fxml"))));
        stage1.setTitle("Online Chat ");
        stage1.setResizable(false);
        stage1.centerOnScreen();
        stage1.show();


    }

}
