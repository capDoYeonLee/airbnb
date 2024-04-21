package com.example.hotelserviceapi.host.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CreateHotelRoom {
    private String hotelId;
    private int hotelGuest;
    private int hotelBedroom;
    private int hotelBed;
    private int hotelBathroom;
}
