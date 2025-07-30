package org.example.money;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assert five.amount == 10 : "Expected amount to be 10, but was " + five.amount;
    }
}
