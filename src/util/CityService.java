package util;

import domain.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CityService {
    private City startCity;
    private City endCity;
    private List<City> cities = List.of(new City("Bishkek"),
            new City("Almaty"),
            new City("Tokmok"),
            new City("Naryn"),
            new City("Osh"),
            new City("New-Yourk"),
            new City("Boston"));
    private int distance;
    private static final Random r = new Random();

    public CityService() {
        newCity(cities.get(r.nextInt(cities.size())));
    }

    public void choose() {
        while(true) {
            endCity = cities.get(r.nextInt(cities.size()));
            if (!endCity.equals(startCity)) {
                break;
            }
        }
    }

    public void newCity(City city) {
        startCity = city;
        choose();
        distance = r.nextInt(51) + 50;
    }

    public City getStartCity() {
        return startCity;
    }

    public void setStartCity(City startCity) {
        this.startCity = startCity;
    }

    public City getEndCity() {
        return endCity;
    }

    public void setEndCity(City endCity) {
        this.endCity = endCity;
    }
}
