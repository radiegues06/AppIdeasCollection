package main;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField binaryDigit;
    @FXML
    private TextField decimalDigit;

    @FXML
    private void initialize() {

        binaryDigit.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("^[0-1]*")) {
                    binaryDigit.setText(oldValue);
                }
            }
        });

    }

    @FXML
    private void convertClicked() {
        String binary = binaryDigit.getText();
        if (!binary.isEmpty()) {
            long decimalNumber = Conversor.getDecimal(binary);
            decimalDigit.setText(String.valueOf(decimalNumber));
        } else {
            decimalDigit.setText("");
        }
    }

}
