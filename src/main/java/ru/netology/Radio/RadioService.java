package ru.netology.Radio;
public class RadioService {
    private int numberCurrentChannel;
    public int currentVolume;

    public void setNewChannel(int newChannel) {
        if ((newChannel <0 ) | (newChannel > 9)) {
            return;
        }
        numberCurrentChannel = newChannel;
    }
    public void nextChannel() {
        if (numberCurrentChannel == 9) {
            numberCurrentChannel = 0;
        } else {
            numberCurrentChannel++;
        }
    }
    public void prevChannel() {
        if (numberCurrentChannel == 0) {
            numberCurrentChannel = 9;
        } else {
            numberCurrentChannel--;
        }
    }

    public int getNumberCurrentChannel() {
        return numberCurrentChannel;
    }

    public void turnUpVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
