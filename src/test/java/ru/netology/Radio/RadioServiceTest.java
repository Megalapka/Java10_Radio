package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldNextChanel() {
        RadioService radio = new RadioService();
        radio.setNewChannel(5);
        radio.nextChannel();

        int expected = 6;
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
        radio.setCurrentVolume(7);
        radio.turnUpVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(100);
        radio.turnUpVolume();

        int expected = 100;
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


    // Tests for code with constructor

    @Test
    public void shouldGetMaxChanel() {
        RadioService radio = new RadioService(22);

        Assertions.assertEquals(21, radio.getMaxChannel());
    }

    @Test
    public void shouldSetNewChannelWithConstructor() {
        RadioService radio = new RadioService(45);
        radio.setNewChannel(43);

        Assertions.assertEquals(43, radio.getNumberCurrentChannel());
    }
    @Test
    public void shouldNotSetChanelAboveMax() {
        RadioService radio = new RadioService(12);
        radio.setNewChannel(22);

        Assertions.assertEquals(0, radio.getNumberCurrentChannel());
    }

    @Test
    public void shouldChangeChanelMaxToZero() {
        RadioService radio = new RadioService(22);
        radio.setNewChannel(radio.getMaxChannel());
        radio.nextChannel();


        Assertions.assertEquals(0, radio.getNumberCurrentChannel());
    }

    @Test
    public void shouldChangeChanelZeroToMax() {
        RadioService radio = new RadioService(22);
        radio.setNewChannel(radio.getMinChannel());
        radio.prevChannel();

        Assertions.assertEquals(21, radio.getNumberCurrentChannel());
    }

}

