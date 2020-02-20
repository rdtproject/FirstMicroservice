package com.tpolm.fms.repository;

import com.tpolm.fms.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {

    Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);

}
