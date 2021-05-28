package avia.repositories;

import avia.models.FavoriteFlightModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FavoriteFlightRepository extends CrudRepository<FavoriteFlightModel, Integer> {

    List<FavoriteFlightModel> findAllByUserId(String userId);
    FavoriteFlightModel findFirstById(Integer id);
}