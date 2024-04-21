package com.example.hotelserviceapi.host.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CreateHotelLocation {
    private String hotelId;
    private Double hotelLatitude;
    private Double hotelLongitude;
    private String hotelLocation;
}
