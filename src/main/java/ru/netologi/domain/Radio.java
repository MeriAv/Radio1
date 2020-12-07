package ru.netologi.domain;

public class Radio {
    int currentWale;
    int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;
    int minWale = 0;
    int maxWale = 9;


public Object Сonditions(){
    if (currentWale < minWale){
        return null;
    }
    if (currentWale > maxWale){
        return null;
    }
    if (currentVolume > maxVolume)
    {
        return null;
    }
    if (currentVolume < minVolume){
        return null;
    }
    return null;
}

public int ButtonNextWale(){
    int currentWales = currentWale + 1;
    if (currentWales > maxWale){
        currentWales = 0;
    }
    return currentWales;
}

public int ButtonPrefWale(){
    int currentWales = currentWale - 1;
    if (currentWales < minWale){
        currentWale = 9;
    }
    return currentWale;
}

public int ButtonNextVolium () {
    int currentVolumeS = currentVolume + 1;
    if (currentVolumeS > maxVolume) {
        currentVolume = 10;
    }
    return currentVolume;
}

    public int ButtonPrefVolium(){
       int currentVolumes = currentVolume -1 ;
        if (currentVolumes < minVolume){
            currentVolume = 0;}
        return currentVolume;
    }

}