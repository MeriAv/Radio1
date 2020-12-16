package ru.netilogy.domane;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

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
    public void snouldRadioButtonNextStationNormQuantity10() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setQuantityStation(10);
        int expected = 2;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }

    @Test
    public void snouldRadioButtonNextStationQuantity0() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setQuantityStation(2);
        int expected = 0;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonPrevStationNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setQuantityStation(20);
        int expected = 4;
        int actual = radio.buttonPrevStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setQuantityStation(2);
        int expected = 2;
        int actual = radio.buttonPrevStation();
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
        int actual = 11;
        int expected = radio.buttonNextVolume();
        assertEquals(actual, expected);
    }


    @Test
    public void snouldRadioButtonPrevVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = 0;
        int expected = radio.buttonPrevVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrevVolumeNorm() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int actual = 3;
        int expected = radio.buttonPrevVolume();
        assertEquals(actual, expected);
    }


}
