package com.safetravel.SafeTravelV1.repository;

import com.safetravel.SafeTravelV1.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
}
