package service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.models.city.City;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecentFlight {
    Integer userId;

    Flight flight;
}
