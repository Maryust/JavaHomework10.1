package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldIncreaseVolumeOverTheLimit() {
        Radio radio = new Radio();
        radio.setVolume(11);
        assertEquals(10, radio.increaseVolume());
    }
    @Test
    public void shouldIncreaseVolumeInTheLimit() {
        Radio radio = new Radio();
        radio.setVolume(7);
        assertEquals(8, radio.increaseVolume());
    }

    @Test
    public void shouldReduceVolumeInTheLimit() {
        Radio radio = new Radio();
        radio.setVolume(5);
        assertEquals(4, radio.reduceVolume());
    }

    @Test
    public void shouldReduceVolumeLowerThanLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        assertEquals(0, radio.reduceVolume());
    }

    @Test
    public void shouldChoseNumberOfRadiostationOverTheLimit() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(11);
        assertEquals(0, radio.getNumberRadiostation());
    }

    @Test
    public void shouldChoseNumberOfRadiostationInTheLimit() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(7);
        assertEquals(7, radio.getNumberRadiostation());
    }

    @Test
    public void shouldChoseNumberOfRadiostationBelowTheLimit() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(-5);
        assertEquals(0, radio.getNumberRadiostation());
    }

    @Test
    public void shouldIncreaseLastRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(9);
        assertEquals(0, radio.increaseStation());
    }

    @Test
    public void shouldIncreaseNumberOfRadiostationInTheLimit() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(8);
        assertEquals(9, radio.increaseStation());
    }

    @Test
    public void shouldReduceZeroRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(0);
        assertEquals(9, radio.reduceStation());
    }

    @Test
    public void shouldReduceNumberOfRadiostationInTheLimit() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(8);
        assertEquals(7, radio.reduceStation());
    }
}

