package main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Algorithm {

    private static LinkedHashMap<String, Double> moneyValues = new LinkedHashMap<>();
    private static HashMap<String, Integer> distribution = new HashMap<>();

    public static HashMap<String,Integer> calculateMoneyDistribution(String moneyUserInput) {
        createMoneyValuesMap();

        double userAmountInput = convertMoneyInputToDouble(moneyUserInput);

        for (Map.Entry<String , Double> entry: moneyValues.entrySet()) {
            String key = entry.getKey();
            Double moneyValue = entry.getValue();

            //TODO consider float division. It is doing it worng. E.g. 17,70

            double amountOfMoneyValue = userAmountInput / moneyValue;

            distribution.put(key, (int) amountOfMoneyValue);

            userAmountInput -= (int) amountOfMoneyValue * moneyValue;
        }

        System.out.println(distribution.toString());
        return distribution;
    }

    public static double convertMoneyInputToDouble(String moneyUserInput) {
        return Double.parseDouble(InputValidator.getInputDigits(moneyUserInput)) / 100.0;
    }

    private static void createMoneyValuesMap() {
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
        moneyValues.put("Cents5", 0.05);
        moneyValues.put("Cents1", 0.01);
    }

}
