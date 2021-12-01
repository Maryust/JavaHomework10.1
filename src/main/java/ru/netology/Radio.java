package ru.netology;

public class Radio {
    private int numberRadioStation;
    private int volume;

    public void setNumberRadioStation(int numberRadioStation) {
        if (numberRadioStation > 9) {
            return;
        }
        if (numberRadioStation < 0) {
            return;
        }
        this.numberRadioStation = numberRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int increaseStation() {
        if (numberRadioStation < 9) {
            numberRadioStation = numberRadioStation + 1;
        } else numberRadioStation = 0;
        return numberRadioStation;
    }

    public int reduceStation() {
        if (numberRadioStation > 0) {
            numberRadioStation = numberRadioStation - 1;
        } else numberRadioStation = 9;
        return numberRadioStation;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        } else volume = 10;
        return volume;
    }

    public int reduceVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else volume = 0;
        return volume;
    }
}
