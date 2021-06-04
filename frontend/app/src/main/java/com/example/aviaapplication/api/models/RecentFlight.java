package com.example.aviaapplication.api.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecentFlight implements Serializable {
    private String userId;
    private Flight flight;
}
