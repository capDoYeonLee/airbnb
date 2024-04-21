package com.example.hotelserviceapi.host.persistence;

import com.example.hotelserviceapi.common.persistence.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotels")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@SuperBuilder(toBuilder = true)
public class HotelEntity extends BaseEntity {

    @Id
    private String hotelId;
    private String hotelStruct;
    private String hotelType;
    private Double hotelLatitude;
    private Double hotelLongitude;
    private String hotelLocation;
    private int hotelGuest;
    private int hotelBedroom;
    private int hotelBed;
    private int hotelBathroom;
    private String hotelAmenity;
    private String hotelPhoto;
    private String hotelTitle;
    private String hotelDescription;
    private Boolean hotelInstantBook;
    private String hotelVisibility;
    private Double hotelPrice;
    private Double hotelDiscount;
    private String hotelLegal;

}
