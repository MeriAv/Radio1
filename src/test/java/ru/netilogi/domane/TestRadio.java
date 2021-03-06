package ru.netilogi.domane;

import org.junit.jupiter.api.Test;
import ru.netologi.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestRadio {


    @Test
    public void snouldRadioButtonNextStationOver() {
        Radio radio = new Radio();
        radio.setCurrentStation (11);
        int expected = 0;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonNextStationNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 2;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonPrefStationNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 4;
        int actual = radio.buttonPrefStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrefStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;
        int actual = radio.buttonPrefStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeNorm() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = 6;
        int expected = radio.buttonNextVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeOver() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int actual = 10;
        int expected = radio.buttonNextVolume();
        assertEquals(actual, expected);
    }


    @Test
    public void snouldRadioButtonPrefVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = 0;
        int expected = radio.buttonPrefVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrefVolumeNorm() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int actual = 3;
        int expected = radio.buttonPrefVolume();
        assertEquals(actual, expected);
    }


}
