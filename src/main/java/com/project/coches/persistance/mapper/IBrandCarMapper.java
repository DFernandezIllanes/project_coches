package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de MarcaCoche a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarPojo toMarcaCochePojo(BrandCarEntity marcaEntity);

    /**
     * Convierte un pjo a una entidad de marca coche
     * @param marcaPojo
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity(BrandCarPojo marcaPojo);

    /**
     * Retorna una lista de marcas coche transformada a ojo de una lista de entidades
     * @param marcasCocheEntity Entidad a transformar
     * @return Lista transformada
     */
    List<BrandCarPojo> toMarcasCochePojo(List<BrandCarEntity> marcasCocheEntity);
}
