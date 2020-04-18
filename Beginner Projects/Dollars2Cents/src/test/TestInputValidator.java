package test;

import main.InputValidator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInputValidator {

    @Test
    public void testInsertStringInIndex() {
        assertEquals("12,34", InputValidator.insertStringInIndex("1234", ",", 2));
        assertEquals("12 34", InputValidator.insertStringInIndex("1234", " ", 2));
        assertEquals(" 1234", InputValidator.insertStringInIndex("1234", " ", 0));
        assertEquals("123 45", InputValidator.insertStringInIndex("12345", " ", 3));
    }

    @Test
    public void testInsertCommaEveryThreeDigits() {
        assertEquals("10.023", InputValidator.insertPointEveryThreeDigits("10023"));
        assertEquals("103", InputValidator.insertPointEveryThreeDigits("103"));
        assertEquals("1.459.103", InputValidator.insertPointEveryThreeDigits("1459103"));
    }

    @Test
    public void testGetFormattedDigits() {
        assertEquals("R$ 10,23",InputValidator.getFormattedDigits(" 1023"));
    }
}
