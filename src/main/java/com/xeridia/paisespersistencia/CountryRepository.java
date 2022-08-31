package com.xeridia.paisespersistencia;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;

interface CountryRepository extends CrudRepository<Country, String> {
    @Override
    Iterable<Country> findAll();

    @Query("select c from Country c where c.name like concat(?1, '%') order by c.name")
    List<Country> findByNameStartsWithOrderByNameAsc(String name);

    long countByNameStartsWithIgnoreCase(@NonNull String name);

    Country findByNameLikeIgnoreCase(String name);



    @Override
    <S extends Country> S save(S entity);
}
