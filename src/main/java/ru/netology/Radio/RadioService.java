package ru.netology.Radio;

public class RadioService {
    private int channelCount = 10;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int numberCurrentChannel = minChannel;
    private int currentVolume;

    public RadioService(int channelCount) {
        this.maxChannel = channelCount - 1;
    }

    public RadioService() {

    }

    public void setNewChannel(int newChannel) {
        if ((newChannel < 0) | (newChannel > maxChannel)) {
            return;
        }
        numberCurrentChannel = newChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void nextChannel() {
        if (numberCurrentChannel == maxChannel) {
            numberCurrentChannel = 0;
        } else {
            numberCurrentChannel++;
        }
    }

    public void prevChannel() {
        if (numberCurrentChannel == 0) {
            numberCurrentChannel = maxChannel;
        } else {
            numberCurrentChannel--;
        }
    }

    public int getNumberCurrentChannel() {
        return numberCurrentChannel;
    }

    public void turnUpVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
