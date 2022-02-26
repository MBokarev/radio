package ru.netology.domain;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void prevRadioStation() {
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }
}
