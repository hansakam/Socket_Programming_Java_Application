package initializer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class client01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/LoginForm01.fxml"));
        Scene mainScene = new Scene(parent);
        primaryStage.setTitle("Live Chat");
        primaryStage.setScene(mainScene);
        primaryStage.centerOnScreen();
        primaryStage.show();

       /* primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm01.fxml"))));
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();*/
    }
}
