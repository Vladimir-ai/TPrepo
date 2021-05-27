package service.internal.impl;

import avia.models.FavoriteFlightModel;
import avia.repositories.FavoriteFlightRepository;
import org.springframework.stereotype.Service;
import service.internal.FavoriteFlightsService;
import service.mapper.FavoriteFlightMapper;
import service.models.FavoriteFlight;
import service.models.Flight;

import java.util.List;

@Service
public class FavoriteFlightImpl implements FavoriteFlightsService {

    private final FavoriteFlightRepository flightRepository;
    private final FavoriteFlightMapper flightMapper;

    public FavoriteFlightImpl(FavoriteFlightRepository flightRepository, FavoriteFlightMapper flightMapper) {
        this.flightRepository = flightRepository;
        this.flightMapper = flightMapper;
    }

    @Override
    public List<FavoriteFlight> getAllFavorite(String userId) {
        List<FavoriteFlightModel> models = flightRepository.findAllByUserId(userId);
        return flightMapper.toListFavoriteFlight(models);
    }

    @Override
    public void addToFavorite(FavoriteFlight flight) {
        FavoriteFlightModel model = flightMapper.toFavoriteFlightModel(flight);
        flightRepository.save(model);
    }

    @Override
    public void deleteFromFavorite(Integer flightId) {
        if (flightRepository.exists(flightId)) {
            flightRepository.delete(flightId);
        } else {
            //обработка ошибки

        }
    }
}
