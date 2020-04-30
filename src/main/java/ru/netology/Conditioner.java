package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            currentTemperature = maxTemperature;

        }
        if (currentTemperature < minTemperature) {
            currentTemperature = minTemperature;

        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }


    // данный метод закомментирован, хоть и требуется использовать по ДЗ return.
    // если не указать к примеру параметр maxTemperature, то return нам возвращает температуру 0.
    // так же я решил что необходимо при попытке изменения температуры выше/ниже нормы, устанавливать значение (max/min)Temperature
 /*   public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }
*/

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature) {
            currentTemperature++;
        } return;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            currentTemperature--;
        } return; //else currentTemperature = minTemperature;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}


