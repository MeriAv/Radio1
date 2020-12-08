package ru.netilogi.domane;

import org.junit.jupiter.api.Test;
import ru.netologi.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestRadio {


    @Test
    public void snouldRadioButtonNextStationOver() {
        Radio radio = new Radio();
        int currentStation = 11;
        int expected = 0;
        int actual = radio.ButtonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonNextStationNorm() {
        Radio radio = new Radio();
        int currentStation = 1;
        int expected = 2;
        int actual = radio.ButtonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonPrefStationNorm() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 4;
        int actual = radio.ButtonPrefStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrefStationMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        int actual = radio.ButtonPrefStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeNorm() {
        Radio radio = new Radio();
        int currentVolume = 5;
        int actual = 6;
        int expected = radio.ButtonNextVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeOver() {
        Radio radio = new Radio();
        int currentVolume = 10;
        int actual = 10;
        int expected = radio.ButtonNextVolume();
        assertEquals(actual, expected);
    }


    @Test
    public void snouldRadioButtonPrefVolumeMin() {
        Radio radio = new Radio();
        int currentVolume = 0;
        int actual = 0;
        int expected = radio.ButtonPrefVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrefVolumeNorm() {
        Radio radio = new Radio();
        int currentVolume = 4;
        int actual = 3;
        int expected = radio.ButtonPrefVolume();
        assertEquals(actual, expected);
    }


}
