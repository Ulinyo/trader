package util;

import domain.City;

import java.util.ArrayList;
import java.util.List;

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

    public CityService() {
    }
}
