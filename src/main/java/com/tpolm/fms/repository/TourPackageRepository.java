package com.tpolm.fms.repository;

import com.tpolm.fms.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(@Param("name") String name);

    // overridden only to use exported false (restrict an access from outside world)
    // in this way methods to modify data will not be exported out of the box
    // the same can be done using Spring Security

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> S save(S s);

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @RestResource(exported = false)
    void delete(TourPackage tourPackage);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends TourPackage> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
