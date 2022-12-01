package web.model;

import org.springframework.stereotype.Component;

public class Car {

    private String model;

    private int horsePower;

    private int doorsAmount;


    public Car(String model, int horsePower, int doorsAmount) {
        this.model = model;
        this.horsePower = horsePower;
        this.doorsAmount = doorsAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", doorsAmount=" + doorsAmount +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }
}
