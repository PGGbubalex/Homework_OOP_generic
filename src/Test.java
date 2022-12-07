import Transport.PassengerCars;
import Transport.TheBuses;
import Transport.Trucks;

public class Test {
    public static void main(String[] args) {


        PassengerCars kamaz = new PassengerCars("Камаз", "65117", 11.8);
        PassengerCars mercedes = new PassengerCars("Мерседес", "actros l", 15.6);
        PassengerCars freightliner = new PassengerCars("Freightliner ", "Coronado", 14.0);
        System.out.println(freightliner);
        freightliner.startMove();
        freightliner.finishMovement();
        freightliner.bestLapTime();
        freightliner.maxSpeed();
        freightliner.pitStop();
        Driver_B<PassengerCars> ivan = new Driver_B<>("Иванов Иван Иванович", "Б", 8);
        ivan.drive(freightliner);


        System.out.println("=======================================================");

        Trucks tesla = new Trucks("Tesla", "Truck", 0);
        Trucks hyndai = new Trucks("Hyndai", "Santa Cruz", 4);
        Trucks ford = new Trucks("Ford", "Maverick", 3.5);
        System.out.println(ford);
        ford.startMove();
        ford.finishMovement();
        ford.bestLapTime();
        ford.maxSpeed();
        ford.pitStop();
        Driver_C<Trucks> petr = new Driver_C<>("Петров Петр Петрович", "С", 7);
        petr.drive(ford);

        System.out.println("=======================================================");

        TheBuses yutong = new TheBuses("Yutong", "U12", 0);
        TheBuses vanHool = new TheBuses("Van Hool", "EX11", 5.7);
        TheBuses setra = new TheBuses("Setra", "S531 DT", 12.8);
        System.out.println(setra);
        setra.startMove();
        setra.finishMovement();
        setra.maxSpeed();
        setra.bestLapTime();
        setra.pitStop();
        Driver_D<TheBuses> fedor = new Driver_D<>("Федеров Федор Федорович", "Д",10);
        fedor.drive(setra);
    }
}