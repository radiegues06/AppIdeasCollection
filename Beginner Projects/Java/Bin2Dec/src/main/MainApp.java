package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
        primaryStage.setTitle("Bin2Dec");
        primaryStage.setScene(new Scene(root, 450, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
