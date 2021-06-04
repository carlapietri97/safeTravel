package com.safetravel.SafeTravelV1.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_test;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "lab_id", referencedColumnName = "id_lab")
    private Laboratory lab_id;

    private String temperature;

    private String pcr_result;

    private String vaccinated;

    private Date test_date;

    private String had_covid;

    public int getId_test() {
        return id_test;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }

    public Laboratory getLab_id() {
        return lab_id;
    }

    public void setLab_id(Laboratory lab_id) {
        this.lab_id = lab_id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPcr_result() {
        return pcr_result;
    }

    public void setPcr_result(String pcr_result) {
        this.pcr_result = pcr_result;
    }

    public String getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(String vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Date getTest_date() {
        return test_date;
    }

    public void setTest_date(Date test_date) {
        this.test_date = test_date;
    }

    public String getHad_covid() {
        return had_covid;
    }

    public void setHad_covid(String had_covid) {
        this.had_covid = had_covid;
    }
}
