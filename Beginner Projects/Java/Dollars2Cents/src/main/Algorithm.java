package main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Algorithm {

    private static LinkedHashMap<String, Integer> moneyValues = new LinkedHashMap<>();
    private static HashMap<String, Integer> distribution = new HashMap<>();

    public static HashMap<String,Integer> calculateMoneyDistribution(String moneyUserInput) {
        createMoneyValuesMap();

        double userAmountInput = convertMoneyInputToInteger(moneyUserInput);

        for (Map.Entry<String , Integer> entry: moneyValues.entrySet()) {
            String key = entry.getKey();
            Integer moneyValue = entry.getValue();

            int amountOfMoneyValue = (int) (userAmountInput / moneyValue);

            distribution.put(key, amountOfMoneyValue);

            userAmountInput -= amountOfMoneyValue * moneyValue;

            System.out.println(userAmountInput);
        }

        System.out.println(distribution.toString());
        return distribution;
    }

    public static double convertMoneyInputToInteger(String moneyUserInput) {
        return Integer.parseInt(InputValidator.getInputDigits(moneyUserInput));
    }

    private static void createMoneyValuesMap() {
        moneyValues.put("Reais100", 10000);
        moneyValues.put("Reais50", 5000);
        moneyValues.put("Reais20", 2000);
        moneyValues.put("Reais10", 1000);
        moneyValues.put("Reais5", 500);
        moneyValues.put("Reais2", 200);
        moneyValues.put("Reais1", 100);
        moneyValues.put("Cents50", 50);
        moneyValues.put("Cents25", 25);
        moneyValues.put("Cents10", 10);
        moneyValues.put("Cents5", 5);
        moneyValues.put("Cents1", 1);
    }

}
