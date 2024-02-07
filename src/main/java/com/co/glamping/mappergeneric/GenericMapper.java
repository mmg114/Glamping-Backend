package com.co.glamping.mappergeneric;

import java.util.List;
import org.springframework.data.domain.Page;
import java.util.Set;

/**
 * @param <D> - DTO typo de parametro
 * @param <E> - Entity tipo de parametro
 * */
public interface GenericMapper<D, E> {
    /**
     * To entity.
     *
     * @param dto the dto
     * @return the e
     */
    E toEntity(D dto);

    /**
     * To dto.
     *
     * @param entity the entity
     * @return the d
     */
    D toDto(E entity);

    /**
     * To entity.
     *
     * @param dtoList the dto list
     * @return the list
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * To dto.
     *
     * @param entityPage the entity page
     * @return the page
     */
    default Page<D> toDto(Page<E> entityPage) {
        return entityPage.map(this::toDto);
    }

    /**
     * To dto.
     *
     * @param entityList the entity list
     * @return the list
     */
    List<D> toDto(List<E> entityList);

    /**
     * To dto.
     *
     * @param entityList the entity list
     * @return the sets the
     */
    Set<D> toDto(Set<E> entityList);
}
