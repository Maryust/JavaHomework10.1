package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"Increase volume over the limit, 11, 10",
                    "Increase volume in the limit, 7, 8"
            }
    )
    public void shouldIncreaseVolume(String name, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Reduce volume in the limit, 5, 4",
                    "Reduce volume lower than the limit, 0, 0"
            }
    )
    public void shouldReduceVolume(String name, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        int actual = radio.reduceVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Chose number of radio station over the limit, 11, 0",
                    "Chose number of radio station in the limit, 7, 7",
                    "Chose number of radio station below the limit, -5, 0",
            }
    )
    public void shouldChoseNumberOfRadioStation(String name, int NumberRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(NumberRadioStation);
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Increase last radio station, 9, 0",
                    "Increase number of radio station in the limit, 8, 9"
            }
    )
    public void shouldIncreaseRadioStation(String name, int NumberRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(NumberRadioStation);
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"Reduce zero radio station, 0, 9",
                    "Reduce number of radio station in the limit, 6, 5"
            }
    )
    public void shouldReduceRadioStation(String name, int NumberRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(NumberRadioStation);
        int actual = radio.reduceStation();
        assertEquals(expected, actual);
    }
}

