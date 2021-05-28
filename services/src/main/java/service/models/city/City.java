package service.models.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    /**
     * код аэропорта
     */
    String PlaceId;

    /**
     * город аэропорт
     */
    String PlaceName;

    /**
     * код города
     */
    String CityId;

    /**
     * название страны
     */
    String CountryName;
}