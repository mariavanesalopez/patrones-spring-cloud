package com.client.service;

public class MockWeatherService implements WeatherService {
    @Override
    public Integer getTemperature(String city, String country) {
        return 25;
    }
}
