public class AirVehicleFactory implements VehicleFactory {
    public Vehicle create(){
        return new Plane();
    }
}
