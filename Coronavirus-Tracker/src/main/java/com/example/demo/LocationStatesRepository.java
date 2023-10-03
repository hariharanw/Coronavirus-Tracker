package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LocationStates;

@Repository
public interface LocationStatesRepository extends JpaRepository<LocationStates, Long> {
    // You can add custom query methods here if needed
}
