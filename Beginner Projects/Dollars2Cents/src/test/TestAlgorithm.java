package test;

import main.Algorithm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlgorithm {

    @Test
    public void testConvertMoneyInput() {
        assertEquals(102.27, Algorithm.convertMoneyInput("R$ 102,27"), 0.001);
        assertEquals(101756.81, Algorithm.convertMoneyInput("R$ 101.756,81"), 0.001);
        assertEquals(12.27, Algorithm.convertMoneyInput("R$ 12,27"), 0.001);
    }
}
