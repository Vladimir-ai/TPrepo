package service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.models.city.City;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    City originPlace;

    City destinationPlace;

    LocalDate outboundDate;

    LocalDate inboundDate;

    Double cost;
}
