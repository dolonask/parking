package kg.megacom.models;

public class Car {

    private double id;
    private String number;


    public Car(String number) {
        this.id = Math.random();
        this.number = number;
    }

    public double getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
