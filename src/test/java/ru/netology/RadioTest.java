package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"Increase volume over the limit, 101, 100",
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

    @Test
    public void shouldChooseAmountOfRadioStation() {
        Radio radio = new Radio(11);
        int actual = radio.getAmountOfRadioStation();
        assertEquals(11, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Choose amount of radio station and choose number or radio station is in the limit, 10, 10",
                    "Choose amount of radio station and choose number or radio station is over the limit, 15, 0",
                    "Choose amount of radio station and choose number or radio station is below the limit, -5, 0",
            }
    )
    public void shouldCheckNumberOfRadioStationInTheLimit(String name, int numberRadioStation, int expected) {
        Radio radio = new Radio(15);
        radio.setNumberRadioStation(numberRadioStation);
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Increase last number of radio station, amount of radio station is default', 9, 0",
                    "'Increase number of radio station in the limit, amount of radio station is default', 5, 6"
            }
    )
    public void shouldIncreaseRadioStation(String name, int numberRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(numberRadioStation);
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Choose amount of radio station and increase last number of radio station, 14, 0",
                    "Choose amount of radio station and increase number of radio station in the limit, 5, 6"
            }
    )
    public void shouldIncreaseRadioStationAndChooseAmount(String name, int numberRadioStation, int expected) {
        Radio radio = new Radio(15);
        radio.setNumberRadioStation(numberRadioStation);
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'Reduce zero number of radio station, amount of radio station is default', 0, 9",
                    "'Reduce number of radio station in the limit, amount of radio station is default', 7, 6"
            }
    )
    public void shouldReduceRadioStation(String name, int numberRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberRadioStation(numberRadioStation);
        int actual = radio.reduceStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"Choose amount of radio station and reduce zero number of radio station and choose amount of radio station, 0, 14",
                    "Choose amount of radio station and reduce number of radio station in the limit and choose amount of radio station, 7, 6"
            }
    )
    public void shouldReduceRadioStationAndChooseAmount(String name, int numberRadioStation, int expected) {
        Radio radio = new Radio(15);
        radio.setNumberRadioStation(numberRadioStation);
        int actual = radio.reduceStation();
        assertEquals(expected, actual);
    }
}

