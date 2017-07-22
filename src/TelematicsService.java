public class TelematicsService extends VehicleInfo {

    public void report(VehicleInfo vehicleInfo) {
        System.out.println("VIN: " + getVIN() + "\nOdo Meter: " +
                getOdometer() + "\nConsumption" + getConsumption() + "\nLast Oil Change: "
                + getOdometerR() + "\nEngine Liters: " + getEngine());

    }
    ;
}
