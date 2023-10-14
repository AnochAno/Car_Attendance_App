package com.example.car_wash_center;

public class Car {
    private String carNo;
    private String driverName;
    private String driverNIC;
    private String phoneNo;
    private String email;

    public Car() { }

    public Car(String carNo, String driverName, String driverNIC, String phoneNo, String email) {
        this.carNo = carNo;
        this.driverName = driverName;
        this.driverNIC = driverNIC;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverNIC() {
        return driverNIC;
    }

    public void setDriverNIC(String driverNIC) {
        this.driverNIC = driverNIC;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
