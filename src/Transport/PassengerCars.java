package Transport;

public class PassengerCars extends Car implements Competing{

    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMove() {
        System.out.println(getBrand() + " начинает движение.");

    }

    @Override
    public void finishMovement() {
        System.out.println(getBrand() + " заканчивает движение.");
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s заехал на пит-стоп\n", getBrand(), getModel());
        System.out.printf("%s %s выехал с пит-стопа\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время %s %s - %.2f\n", getBrand(), getModel(), (1 + Math.random()));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость %s %s - %.2f\n", getBrand(),getModel(), (100 + Math.random() * 200));
    }
}
