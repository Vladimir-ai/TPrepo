package service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.models.city.City;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    Integer id;
    City originPlace;
    City destinationPlace;
    Date outboundDate;
    Date inboundDate;
    Double cost;
}
