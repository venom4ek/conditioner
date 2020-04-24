package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(17);
        conditioner.increaseCurrentTemperature();
        int expected = 18;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(26);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(32);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }


    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(17);
        conditioner.decreaseCurrentTemperature();
        int expected = 16;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(26);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }


}

