package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
    }


    @ParameterizedTest(name = "[{index}]{0}")
    @CsvFileSource(resources = "/increase.csv")
    void increaseCurrentTemperature1(String test, int maxTemp, int minTemp, int curTemp, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(maxTemp);
        conditioner.setMinTemperature(minTemp);
        conditioner.setCurrentTemperature(curTemp);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest(name = "[{index}]{0}")
    @CsvFileSource(resources = "/decrease.csv")
    void decreaseCurrentTemperature1(String test, int maxTemp, int minTemp, int curTemp, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(maxTemp);
        conditioner.setMinTemperature(minTemp);
        conditioner.setCurrentTemperature(curTemp);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Disabled
    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(17);
        int expected = 18;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Disabled
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(21);
        int expected = 19;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}

