public class WaterVehicleFactory implements VehicleFactory {
    public Vehicle create(){
        return new Boat();
    }
}
