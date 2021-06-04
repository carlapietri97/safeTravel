package com.safetravel.SafeTravelV1.controller;

import com.safetravel.SafeTravelV1.model.Flight;
import com.safetravel.SafeTravelV1.model.Laboratory;
import com.safetravel.SafeTravelV1.model.Passenger;
import com.safetravel.SafeTravelV1.model.Test;
import com.safetravel.SafeTravelV1.repository.FlightRepository;
import com.safetravel.SafeTravelV1.repository.LaboratoryRepository;
import com.safetravel.SafeTravelV1.repository.PassengerRepository;
import com.safetravel.SafeTravelV1.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/safetravel/v1")

public class MainController {

    @Autowired
    private LaboratoryRepository laboratoryRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private PassengerRepository passengerRepository;


    @GetMapping(path = "/laboratories/all")
    public @ResponseBody
    Iterable<Laboratory> getAllLabs() {
        return laboratoryRepository.findAll();
    }

    @GetMapping(path = "/laboratory/{id_lab}")
    public @ResponseBody
    Optional<Laboratory> getLabById(@PathVariable("id_lab") int id_lab) {
        return laboratoryRepository.findById(id_lab);
    }

    @GetMapping(path = "/flight/all")
    public @ResponseBody
    Iterable<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @GetMapping(path = "/flight/{id_flight}")
    public @ResponseBody
    Optional<Flight> getFlightById(@PathVariable("id_flight") int id_flight) {
        return flightRepository.findById(id_flight);
    }

    @GetMapping(path = "/test/all")
    public @ResponseBody
    Iterable<Test> getAllTests() {
        return testRepository.findAll();
    }

    @GetMapping(path = "/test/{id_test}")
    public @ResponseBody
    Optional<Test> getTestById(@PathVariable("id_test") int id_test) {
        return testRepository.findById(id_test);
    }

    @GetMapping(path = "/test/{id_test}/pcr_result")
    public @ResponseBody
    String getPcrResult(@PathVariable("id_test") int id_test) {

        Test test = testRepository.findById(id_test).get();

        String testPcr = test.getPcr_result();

        if (testPcr.equals("positive")) {

            return "El resultado de su pcr es Positivo, por lo tanto no puede abordar ";
        }
        return "Adelante, puede abordar ";
    }

    @GetMapping(path = "/passenger/all")
    public @ResponseBody
    Iterable<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @GetMapping(path = "/passenger/{id_passenger}")
    public @ResponseBody
    Optional<Passenger> getPassengerById(@PathVariable("id_passenger") int id_passenger) {
        return passengerRepository.findById(id_passenger);
    }

    @GetMapping(path = "/passenger/passport_number/{passport_number}")
    public @ResponseBody
    Iterable<Passenger> getPassengerByPassportNumber(@PathVariable("passport_number") String passport_number) {
        return passengerRepository.getPassengerByPassportNumber(passport_number);
    }

    @PostMapping(path = "/flight/create", consumes = "application/json", produces = "application/json")
    public Flight createFlight(@RequestBody Flight newFlight) {
        return flightRepository.save(newFlight);
    }

    @PostMapping(path = "/laboratory/create", consumes = "application/json", produces = "application/json")
    public Laboratory createLaboratory(@RequestBody Laboratory newLaboratory) {
        return laboratoryRepository.save(newLaboratory);
    }

    @PostMapping(path = "/passenger/create", consumes = "application/json", produces = "application/json")
    public Passenger createPassenger(@RequestBody Passenger newPassenger) {

        return passengerRepository.save(newPassenger);

    }

    @GetMapping(path = "/passenger/{id_passenger}/lab/{id_lab}")
    public String updateLabByPassenger(@PathVariable("id_passenger") int id_passenger, @PathVariable("id_lab") int id_lab) {

        Laboratory laboratory = laboratoryRepository.findById(id_lab).orElse(null);

        Passenger passenger = passengerRepository.findById(id_passenger).get();

        if (laboratory != null) {
            passenger.getTest_id().setLab_id(laboratory);

            passengerRepository.save(passenger);

            return " El laboratorio del pasajero se actualizo exitosamente ";

        }

        return "El laboratorio no existe ";

    }

    @PostMapping(path = "/test/create", consumes = "application/json", produces = "application/json")
    public Test createTest(@RequestBody Test newTest) {
        return testRepository.save(newTest);
    }

    @PutMapping(path = "/flight/update")
    public Flight updateFlight(@RequestBody Flight updatedFlight) {
        return flightRepository.save(updatedFlight);
    }

    @PutMapping(path = "/laboratory/update")
    public Laboratory updateLaboratory(@RequestBody Laboratory updatedLaboratory) {
        return laboratoryRepository.save(updatedLaboratory);
    }

    @PutMapping(path = "/passenger/update")
    public Passenger updatePassenger(@RequestBody Passenger updatedPassenger) {
        return passengerRepository.save(updatedPassenger);
    }

    @PutMapping(path = "/test/update")
    public Test updateTest(@RequestBody Test updatedTest) {
        return testRepository.save(updatedTest);
    }

    @DeleteMapping(path = "/flight/delete/{id_flight}")
    Iterable<Flight> deleteFlightById(@PathVariable("id_flight") int id_flight) {
        flightRepository.deleteById(id_flight);
        return flightRepository.findAll();
    }

    @DeleteMapping(path = "/laboratory/delete/{id_lab}")
    Iterable<Laboratory> deleteLaboratoryById(@PathVariable("id_lab") int id_lab) {
        laboratoryRepository.deleteById(id_lab);
        return laboratoryRepository.findAll();
    }

    @DeleteMapping(path = "/passenger/delete/{id_passenger}")
    Iterable<Passenger> deletePassengerById(@PathVariable("id_passenger") int id_passenger) {
        passengerRepository.deleteById(id_passenger);
        return passengerRepository.findAll();
    }

    @DeleteMapping(path = "/test/delete/{id_test}")
    Iterable<Test> deletePilotById(@PathVariable("id_test") int id_test) {
        testRepository.deleteById(id_test);
        return testRepository.findAll();
    }


}
