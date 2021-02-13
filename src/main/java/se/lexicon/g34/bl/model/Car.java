package se.lexicon.g34.bl.model;

import java.io.Serializable;
import java.util.UUID;


public class Car implements Serializable {
    private UUID carUUID;
    private String regNumber;
    private String brand;
    private String model;
    private String color;
    private int year;


    public Car() {
    }

    public Car(String regNumber, String brand, String model,String color,int year) {
        this.carUUID = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.color=color;
        this.model = model;
        this.year=year;
    }

    public UUID getCarUUID() {
        return carUUID;
    }

    public void setCarUUID(UUID carUUID) {
        this.carUUID = carUUID;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() { return color;}

    public void setColor(String color) {this.color = color;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    @Override
    public String toString() {//CSV format
        return carUUID + ";" +
                regNumber + ";" +
                brand + ";" +
                model + ";" +
                year ;
    }
/*
    @Override
    public String toString() {
        return "Car{" +
                "carUUID=" + carUUID +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
*/
}

