import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("Marcin", "Kaminski", "Wh9338", "Scania", "312", 16, "patelnia");
        PassengerCar passengerCars = new PassengerCar("mar", "ewfe", "wer434", "honda", "crv", 1999, "petrol");
        CarMechanicService service=new CarMechanicService();
        service.addNewCar(truck);
        service.addNewCar(passengerCars);
        Repair repair = new Repair("wymisnsa opon",200, LocalDate.now());
        service.addNewRepairToVehicleByLicencePlate("wu34r4",repair);
        service.printCarByLicencePlate("Wj9939");

    }
}
