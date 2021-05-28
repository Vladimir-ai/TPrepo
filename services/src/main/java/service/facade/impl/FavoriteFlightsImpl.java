package service.facade.impl;

import org.springframework.stereotype.Service;
import service.facade.FavoriteFlightsFacade;
import service.internal.FavoriteFlightsService;
import service.models.FavoriteFlight;

import java.util.List;

@Service
public class FavoriteFlightsImpl implements FavoriteFlightsFacade {
    private final FavoriteFlightsService favoriteFlightsService;

    public FavoriteFlightsImpl(FavoriteFlightsService favoriteFlightsService) {
        this.favoriteFlightsService = favoriteFlightsService;

    }

    @Override
    public List<FavoriteFlight> getAllFavorite(String userId) {
        return favoriteFlightsService.getAllFavorite(userId);
    }

    @Override
    public void addToFavorite(FavoriteFlight flight) {
        favoriteFlightsService.addToFavorite(flight);
    }

    @Override
    public boolean deleteFromFavorite(Integer flightId) {
        return favoriteFlightsService.deleteFromFavorite(flightId);
    }
}
