package ru.mirea.prak11;

public class Car implements Priceable{
    private int carPrice;
    private String carBrand;

    public Car(int carPrice, String carBrand) {
        this.carPrice = carPrice;
        this.carBrand = carBrand;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public int getPrice() {
        return this.carPrice;
    }
}
