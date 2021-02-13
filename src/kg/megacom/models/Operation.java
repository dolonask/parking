package kg.megacom.models;

import kg.megacom.enums.OperationStatus;

import java.util.Date;

public class Operation {


    private double id;
    private Car car;
    private Date startDate;
    private Date endDate;
    private double price;
    private OperationStatus status;

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public Operation(Car car) {
        this.id = Math.random();
        this.car = car;
        this.startDate = new Date();
        this.status = OperationStatus.OPEN;
    }

    public double getId() {
        return id;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
