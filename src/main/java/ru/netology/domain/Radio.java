package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int amountRadioStations = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getAmountRadioStations() {
        return amountRadioStations;
    }

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
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void reduceVolume() {
        setCurrentVolume(currentVolume - 1);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        this.currentVolume = newCurrentVolume;
    }

    public Radio() {
    }

    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
    }
}