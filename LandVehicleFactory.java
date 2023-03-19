public class LandVehicleFactory implements VehicleFactory {
    public Vehicle create(){
        return new Car();
    }
}
