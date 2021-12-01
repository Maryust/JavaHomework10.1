package ru.netology;

public class Radio {
    private int numberRadiostation;
    private int volume;

    public void setNumberRadiostation(int numberRadiostation) {
        if (numberRadiostation > 9) {
            return;
        }
        if (numberRadiostation < 0) {
            return;
        }
        this.numberRadiostation = numberRadiostation;
    }

    public int getNumberRadiostation() {
        return numberRadiostation;
    }

    public int increaseStation() {
        if (numberRadiostation < 9) {
            numberRadiostation = numberRadiostation + 1;
        } else numberRadiostation = 0;
        return numberRadiostation;
    }

    public int reduceStation() {
        if (numberRadiostation > 0) {
            numberRadiostation = numberRadiostation - 1;
        } else numberRadiostation = 9;
        return numberRadiostation;
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
