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
public class VW {
    int idVW;
    String manufacturer;
    String model;
    int year;
    String type;
    double fueleconomy;
    double engine;
    int HorsePower;

    public VW(int idVW, String manufacturer, String model, int year, String type, double fueleconomy, double engine, int HorsePower) {
        this.idVW = idVW;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.type = type;
        this.fueleconomy = fueleconomy;
        this.engine = engine;
        this.HorsePower = HorsePower;
    }

    public int getIdVW() {
        return idVW;
    }

    public void setIdVW(int idVW) {
        this.idVW = idVW;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int HorsePower) {
        this.HorsePower = HorsePower;
    }
    
}
