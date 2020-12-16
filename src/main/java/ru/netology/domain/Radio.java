package ru.netology.domain;

public class Radio {

    private int quantityStation;
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int minStation = 0;

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }


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
        if (currentStations > quantityStation) {
            currentStations = minStation;
        }
        return currentStations;
    }

    public int buttonPrevStation() {
        int currentStations = currentStation - 1;
        if (currentStations < minStation) {
            currentStations = quantityStation;
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

