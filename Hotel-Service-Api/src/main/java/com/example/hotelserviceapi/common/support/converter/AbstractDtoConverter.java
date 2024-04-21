package com.example.hotelserviceapi.support.converter;


import com.example.hotelserviceapi.support.AbstractModel;
import com.example.hotelserviceapi.support.dto.AbstractDto;

public interface AbstractDtoConverter<T extends AbstractDto, R extends AbstractModel> {
    R from(T t);
}