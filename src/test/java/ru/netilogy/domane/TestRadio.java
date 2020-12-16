package ru.netilogy.domane;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestRadio {


    public TestRadio() {
    }

    @Test
    public void snouldRadioButtonNextStationOver() {
        Radio radio = new Radio(10,11);
        int expected = 0;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonNextStationNormQuantity10() {
        Radio radio = new Radio(10,1);
        int expected = 2;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }

    @Test
    public void snouldRadioButtonNextStationQuantity0() {
        Radio radio = new Radio(2,3);
        int expected = 0;
        int actual = radio.buttonNextStation();
        assertEquals(expected, actual);
    }


    @Test
    public void snouldRadioButtonPrevStationNorm() {
        Radio radio = new Radio(20,5);
        int expected = 4;
        int actual = radio.buttonPrevStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrevStationMin() {
        Radio radio = new Radio(2,0);
        int expected = 2;
        int actual = radio.buttonPrevStation();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeNorm() {
        Radio radio = new Radio(5);
        int actual = 6;
        int expected = radio.buttonNextVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonNextVolumeOver() {
        Radio radio = new Radio(10);
        int actual = 11;
        int expected = radio.buttonNextVolume();
        assertEquals(actual, expected);
    }


    @Test
    public void snouldRadioButtonPrevVolumeMin() {
        Radio radio = new Radio(0);
        int actual = 0;
        int expected = radio.buttonPrevVolume();
        assertEquals(actual, expected);
    }

    @Test
    public void snouldRadioButtonPrevVolumeNorm() {
        Radio radio = new Radio(4);
        int actual = 3;
        int expected = radio.buttonPrevVolume();
        assertEquals(actual, expected);
    }


}
