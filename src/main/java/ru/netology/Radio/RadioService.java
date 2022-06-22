package ru.netology.Radio;
public class RadioService {
    public int numberCurrentChannel;
    public int currentVolume;
    public void NextChannel() {
        if (numberCurrentChannel == 9) {
            numberCurrentChannel = 0;
        } else {
            numberCurrentChannel++;
        }
    }
    public void PrevChannel() {
        if (numberCurrentChannel == 0) {
            numberCurrentChannel = 9;
        } else {
            numberCurrentChannel--;
        }
    }

    public void setNewChannel(int newChannel) {
        if ((newChannel <=0 ) | (newChannel >= 9)) {
            return;
        }
        numberCurrentChannel = newChannel;
    }
}
