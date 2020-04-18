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


}
