package main;

public class InputValidator {

    private static final int MINIMUM_VALUE_SCREEN_LENGTH = 3;
    public static final String moneyMarker = "R$";

    private static String getInputDigits(String userViewMoneyDigits) {
        return userViewMoneyDigits.replaceAll("[^\\d]", "");
    }

    public static String getFormattedDigits(String userViewMoneyDigits) {

        String inputNumbers = getInputDigits(userViewMoneyDigits);

        int zerosToTheLeft = 0;
        while (inputNumbers.length() > 1 && zerosToTheLeft < inputNumbers.length() &&
                inputNumbers.substring(zerosToTheLeft,zerosToTheLeft + 1).equals("0") ) {
            zerosToTheLeft++;
        }

        inputNumbers = inputNumbers.substring(zerosToTheLeft);

        if (inputNumbers.length() < MINIMUM_VALUE_SCREEN_LENGTH) {
            while (inputNumbers.length() < MINIMUM_VALUE_SCREEN_LENGTH) {
                inputNumbers = "0" + inputNumbers;
            }
        }

        String integerDigits = inputNumbers.substring(0, inputNumbers.length() - 2);
        String integerPart = "";

        for (int i = 0; i < integerDigits.length() - 1; i+=3) {

        }

        String decimalPart = inputNumbers.substring(inputNumbers.length() - 2);

        String formattedNumbers = moneyMarker + " " + integerPart + "," + decimalPart;


        return formattedNumbers;
    }

    public static String insertStringInIndex(String originalString, String addString, int index) {
        return originalString.substring(0, index) + addString +
                originalString.substring(index);
    }
}
