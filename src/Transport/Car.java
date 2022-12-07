package Transport;

import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String model;
    private final double engineCapacity;

    public Car(String brand, String model, double engineCapacity) {

        this.brand = ValidationUtill.validateString(brand);
        this.model = ValidationUtill.validateString(model);
        this.engineCapacity = ValidationUtill.validateNum(engineCapacity);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public abstract void startMove();

    public abstract void finishMovement();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

}
