package com.safetravel.SafeTravelV1.model;


import javax.persistence.*;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_passenger;

    private String passport_number;

    private String name;

    private String last_name;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "flight_id", referencedColumnName = "id_flight")
    private Flight flight_id;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "test_id", referencedColumnName = "id_test")
    private Test test_id;

    public int getId_passenger() {
        return id_passenger;
    }

    public void setId_passenger(int id_passenger) {
        this.id_passenger = id_passenger;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Flight getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Flight flight_id) {
        this.flight_id = flight_id;
    }

    public Test getTest_id() {
        return test_id;
    }

    public void setTest_id(Test test_id) {
        this.test_id = test_id;
    }
}
