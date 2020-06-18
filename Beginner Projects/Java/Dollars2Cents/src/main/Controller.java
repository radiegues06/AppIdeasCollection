package main;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Controller {

    @FXML
    private TextField money;

    private List<TextField> moneyFieldsList = new ArrayList<TextField>();

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
        if (!money.getText().isEmpty()) {
            HashMap<String,Integer> distribution =  Algorithm.calculateMoneyDistribution(money.getText());

            for (Map.Entry<String,Integer> entry: distribution.entrySet()) {
                String key = entry.getKey();
                Integer amount = entry.getValue();

                for (TextField field : moneyFieldsList) {
                    if (field.getId().equals(key + "Field"))
                        field.setText(String.valueOf(amount));
                }

            }
        }
    }



    @FXML
    private void initialize() {

        money.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                money.setText(InputValidator.getFormattedDigits(newValue));
            }
        });

        createMoneyFieldsList();
    }

    private void createMoneyFieldsList() {
        moneyFieldsList.add(Reais100Field);
        moneyFieldsList.add(Reais50Field);
        moneyFieldsList.add(Reais20Field);
        moneyFieldsList.add(Reais10Field);
        moneyFieldsList.add(Reais5Field);
        moneyFieldsList.add(Reais2Field);
        moneyFieldsList.add(Reais1Field);
        moneyFieldsList.add(Cents50Field);
        moneyFieldsList.add(Cents25Field);
        moneyFieldsList.add(Cents10Field);
        moneyFieldsList.add(Cents5Field);
        moneyFieldsList.add(Cents1Field);
    }
}
