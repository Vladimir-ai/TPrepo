package service.internal;


import service.models.RecentCity;
import service.models.city.City;

import java.io.IOException;
import java.util.List;


public interface CityService {
    List<RecentCity> getRecentCities(String userId);

    List<City> searchPlaceByName(String name) throws IOException;

    void addRecentCity(RecentCity recentCity);
    void addRecentCity(City city, String userId);

}
