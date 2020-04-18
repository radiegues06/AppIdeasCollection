package main;

import java.util.HashMap;

public class Algorithm {

    public Algorithm() {
        createMoneyValuesMap();
    }

    private static HashMap<String, Double> moneyValues = new HashMap<>();
    private static HashMap<String, Integer> distribution = new HashMap<>();

    public static HashMap<String , Integer> calculateMoneyDistribution(String moneyUserInput) {
        double money = convertMoneyInput(moneyUserInput);
        return distribution;
    }

    public static double convertMoneyInput(String moneyUserInput) {
        return Double.parseDouble(InputValidator.getInputDigits(moneyUserInput)) / 100.0;
    }

    private void createMoneyValuesMap() {
        moneyValues.put("Reais100", 100.0);
        moneyValues.put("Reais50", 50.0);
        moneyValues.put("Reais20", 20.0);
        moneyValues.put("Reais10", 10.0);
        moneyValues.put("Reais5", 5.0);
        moneyValues.put("Reais2", 2.0);
        moneyValues.put("Reais1", 1.0);
        moneyValues.put("Cents50", 0.50);
        moneyValues.put("Cents25", 0.25);
        moneyValues.put("Cents10", 0.10);
        moneyValues.put("Cents05", 0.05);
        moneyValues.put("Cents01", 0.01);
    }

}
