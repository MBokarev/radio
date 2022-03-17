package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetAmountRadioStation() {
        Radio radio = new Radio(40);

        assertEquals(40, radio.getAmountRadioStations());
    }

    @Test
    public void defaultAmountRadioStation() {
        Radio radio = new Radio();

        assertEquals(10, radio.getAmountRadioStations());
    }

    @Test
    public void amountRadioStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void amountRadioStationUnderLimit() {
        Radio radio = new Radio();

        radio.prevRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeUnderLimit() {
        Radio radio = new Radio();

        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}