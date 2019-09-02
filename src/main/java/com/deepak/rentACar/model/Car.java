package com.deepak.rentACar.model;

import com.deepak.rentACar.util.enums.CarType;
import com.deepak.rentACar.util.enums.City;

public class Car {
	private long id;
	private String manufacuterer;
	private String model;
	private CarType carType;
	private int makeYear;
	private int mileage;
	private String fuleType;
	private City city;
	private boolean isAvailable;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getManufacuterer() {
		return manufacuterer;
	}
	public void setManufacuterer(String manufacuterer) {
		this.manufacuterer = manufacuterer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getFuleType() {
		return fuleType;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	

}
