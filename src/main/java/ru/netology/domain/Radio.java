package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int minStation = 0;
    private int maxStation = 9;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;

    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation() {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public int buttonNextStation() {
        int currentStations = currentStation + 1;
        if (currentStations > maxStation) {
            currentStations = minStation;
        }
        return currentStations;
    }

    public int buttonPrevStation() {
        int currentStations = currentStation - 1;
        if (currentStations < minStation) {
            currentStations = maxStation;
        }
        return currentStations;
    }

    public int buttonNextVolume() {
        int currentVolumes = currentVolume + 1;
        if (currentVolumes > maxVolume) {
            currentVolumes = maxVolume;
        }
        return currentVolumes;
    }

    public int buttonPrevVolume() {
        int currentVolumes = currentVolume - 1;
        if (currentVolumes < minVolume) {
            currentVolumes = minVolume;
        }
        return currentVolumes;
    }

}

