package main;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField money;

    @FXML
    private TextField Reais100Field;
    @FXML
    private TextField Reais50Field;
    @FXML
    private TextField Reais20Field;
    @FXML
    private TextField Reais10Field;
    @FXML
    private TextField Reais5Field;
    @FXML
    private TextField Reais2Field;
    @FXML
    private TextField Reais1Field;
    @FXML
    private TextField Cents50Field;
    @FXML
    private TextField Cents25Field;
    @FXML
    private TextField Cents10Field;
    @FXML
    private TextField Cents5Field;
    @FXML
    private TextField Cents1Field;

    @FXML
    private void calculateClick() {
        System.out.println("oi");
    }



    @FXML
    private void initialize() {

        money.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                money.setText(InputValidator.getFormattedDigits(newValue));
            }
        });

    }
}
