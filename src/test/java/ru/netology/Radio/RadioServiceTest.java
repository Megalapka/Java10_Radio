package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldNextChanel() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 5;
        radio.NextChannel();

        int expected = 6;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelNineToZero() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 9;
        radio.NextChannel();

        int expected = 0;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChanel() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 6;
        radio.PrevChannel();

        int expected = 5;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelZeroToNine() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 0;
        radio.PrevChannel();

        int expected = 9;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewChanel() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 0;
        radio.setNewChannel(5);

        int expected = 5;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelAboveNine() {
        RadioService radio = new RadioService();
        radio.numberCurrentChannel = 0;
        radio.setNewChannel(12);

        int expected = 0;
        int actual = radio.numberCurrentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolume() {
        RadioService radio = new RadioService();
        radio.currentVolume = 6;
        radio.turnUpVolume();

        int expected = 7;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        RadioService radio = new RadioService();
        radio.currentVolume = 10;
        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        RadioService radio = new RadioService();
        radio.currentVolume = 6;
        radio.turnDownVolume();

        int expected = 5;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownLessZeroVolume() {
        RadioService radio = new RadioService();
        radio.currentVolume = 0;
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}

