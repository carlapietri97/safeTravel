package com.safetravel.SafeTravelV1.repository;

import com.safetravel.SafeTravelV1.model.Passenger;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

    @Query("from Passenger where passport_number like %:passport_number%")

    Iterable<Passenger> getPassengerByPassportNumber(@Param("passport_number") String passport_number);
}
