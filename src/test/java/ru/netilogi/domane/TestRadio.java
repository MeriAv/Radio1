package ru.netilogi.domane;

import org.junit.jupiter.api.Test;
import ru.netologi.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestRadio {

    @Test
    public void snouldRadioСonditionsMax(){
        Radio radio = new Radio();
        int curentWale = 11;
        int currentVolume = 11;
        assertNull(radio.Сonditions());
    }

    @Test
    public void snouldRadioСonditionsMin(){
        Radio radio = new Radio();
        int curentWale = -1;
        int currentVolume = -1;
        assertNull(radio.Сonditions());
    }

    @Test
    public void snouldRadioButtonNextWaleOver(){
        Radio radio = new Radio();
        int curentWale = 11;
        int expected = 0;
        int actual = radio.ButtonNextWale();
        assertEquals(expected,actual);
    }
// с этого теста все ломается
    @Test
    public void snouldRadioButtonNextWaleNorm(){
        Radio radio = new Radio();
        int currentWales = 1;
        int expected = 2;
        int actual = radio.ButtonNextWale();
        assertEquals(expected,actual);
    }


    @Test
    public void SnouldRadioButtonPrefWaleNorm(){
        Radio radio = new Radio();
        int currentWale = 5;
        int expected = 4;
        int actual = radio.ButtonPrefWale();
        assertEquals(actual,expected);
}

    @Test
    public void snouldRadioButtonPrefWaleMin(){
        Radio radio = new Radio();
        int currentWale = 0;
        int expected = 9;
        int actual = radio.ButtonPrefWale();
        assertEquals(actual,expected);
    }

    @Test
    public void snouldRadioButtonNextVoliumNorm(){
        Radio radio = new Radio();
        int currentVolium = 5;
        int actual = 6;
        int expected = radio.ButtonNextVolium();
        assertEquals(actual,expected);
}
    @Test
    public void snouldRadioButtonNextVoliumOver(){
        Radio radio = new Radio();
        int currentVolium = 10;
        int actual = 10;
        int expected = radio.ButtonNextVolium();
        assertEquals(actual,expected);
    }


    @Test
    public void snouldRadioButtonPrefVoliumMin(){
        Radio radio = new Radio();
        int currentVolium = 0;
        int actual = 0;
        int expected = radio.ButtonPrefVolium();
        assertEquals(actual,expected);
    }
    @Test
    public void snouldRadioButtonPrefVoliumNorm(){
        Radio radio = new Radio();
        int currentVolium = 4;
        int actual = 3;
        int expected = radio.ButtonPrefVolium();
        assertEquals(actual,expected);
    }


}
