/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author pc
 */
public class Car {
    int idCar;
    String manufacturer;
    String model;
    int year;
    String type;
    double fueleconomy;
    double engine;

    public Car(int idCar, int year, String type, double fueleconomy, double engine) {
        this.idCar = idCar;
        this.year = year;
        this.type = type;
        this.fueleconomy = fueleconomy;
        this.engine = engine;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFueleconomy() {
        return fueleconomy;
    }

    public void setFueleconomy(double fueleconomy) {
        this.fueleconomy = fueleconomy;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
    
}
