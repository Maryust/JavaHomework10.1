package ru.netology;

public class Radio {
    private int amountOfRadioStation = 10;
    private int numberRadioStation;
    private int volume;

    public Radio() {
    }

    public Radio(int amountOfRadioStation) {
        this.amountOfRadioStation = amountOfRadioStation;

    }

    public void setNumberRadioStation(int numberRadioStation) {
        if (numberRadioStation > amountOfRadioStation - 1) {
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

    public int getAmountOfRadioStation() {
        return amountOfRadioStation;
    }

    public int increaseStation() {
        if (numberRadioStation < amountOfRadioStation - 1) {
            numberRadioStation = numberRadioStation + 1;
        } else numberRadioStation = 0;
        return numberRadioStation;
    }

    public int reduceStation() {
        if (numberRadioStation > 0) {
            numberRadioStation = numberRadioStation - 1;
        } else numberRadioStation = amountOfRadioStation - 1;
        return numberRadioStation;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else volume = 100;
        return volume;
    }

    public int reduceVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else volume = 0;
        return volume;
    }
}
