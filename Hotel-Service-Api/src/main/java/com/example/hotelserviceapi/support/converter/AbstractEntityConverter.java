package com.example.hotelserviceapi.support.converter;


import com.example.hotelserviceapi.persistence.BaseEntity;
import com.example.hotelserviceapi.support.AbstractModel;

public interface AbstractEntityConverter<T extends BaseEntity, R extends AbstractModel> {

    R from(T t);

    T toEntity(R t);
}