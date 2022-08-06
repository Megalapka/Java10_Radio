package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldNextChanel() {
        RadioService radio = new RadioService();
        radio.setNewChannel(8);
        radio.nextChannel();

        int expected = 9;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelNineToZero() {
        RadioService radio = new RadioService();
        radio.setNewChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChanel() {
        RadioService radio = new RadioService();
        radio.setNewChannel(6);
        radio.prevChannel();

        int expected = 5;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelZeroToNine() {
        RadioService radio = new RadioService();
        radio.setNewChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewChanel() {
        RadioService radio = new RadioService();
        radio.setNewChannel(0);
        radio.setNewChannel(5);

        int expected = 5;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelAboveNine() {
        RadioService radio = new RadioService();
        radio.setNewChannel(0);
        radio.setNewChannel(12);

        int expected = 0;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelBelowZero() {
        RadioService radio = new RadioService();
        radio.setNewChannel(4);
        radio.setNewChannel(-2);

        int expected = 4;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnUpVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(8);
        radio.turnUpVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(10);
        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(6);
        radio.turnDownVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownLessZeroVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newshouldNotTurnDownLessZeroVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

