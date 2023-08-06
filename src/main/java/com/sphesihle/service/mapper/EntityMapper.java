package com.sphesihle.service.mapper;

import org.mapstruct.*;

/**
 * Contract for a generic dto to and entity mapper.
 * @param <D> - DTO Type parameter
 * @param <E> - Entity Type parameter
 */
public interface EntityMapper <D,E>{

    E toEntity(D dto);

    D toDto(E entity);

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E entity, D dto);
}
