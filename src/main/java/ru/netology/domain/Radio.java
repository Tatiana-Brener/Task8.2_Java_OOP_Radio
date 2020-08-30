package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation)
            return;
        if (currentRadioStation < firstRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume)
            return;
        if (currentSoundVolume < minSoundVolume)
            return;
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void changeNextRadioStation() {
        if (currentRadioStation < lastRadioStation)
            currentRadioStation++;

        if (currentRadioStation == lastRadioStation)
        this.currentRadioStation = firstRadioStation;

    }

    public void changePrevRadioStation() {
        if (currentRadioStation > firstRadioStation)
            currentRadioStation--;

        if (currentRadioStation == firstRadioStation)
        this.currentRadioStation = lastRadioStation;
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume)
            currentSoundVolume++;
        this.currentSoundVolume = currentSoundVolume;
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume)
            currentSoundVolume--;
        this.currentSoundVolume = currentSoundVolume;
    }
}
