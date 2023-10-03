package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocationStates {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String state;
    private String country;
    private int latestTotalDeaths;
    private int differFromPrevDay;
     

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDifferFromPrevDay() {
        return differFromPrevDay;
    }

    public void setDifferFromPrevDay(int differFromPrevDay) {
        this.differFromPrevDay = differFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalDeaths() {
        return latestTotalDeaths;
    }

    public void setLatestTotalDeaths(int latestTotalDeaths) {
        this.latestTotalDeaths = latestTotalDeaths;
    }

   
    @Override
    public String toString() {
        return "LocationStates [state=" + state + ", country=" + country + ", latestTotalDeaths=" + latestTotalDeaths
                + ", differFromPrevDay=" + differFromPrevDay + "]";
    }
}
