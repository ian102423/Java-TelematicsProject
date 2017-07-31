public class VehicleInfo {
//    VIN (Vehicle Identification Number)
//    odometer (miles traveled)
//    consumption (gallons of gas consumed)
//    odometer reading for last oil change
//    engine size in liters (e.g. 2.0, 4.5)

    int VIN;
    double odometer;
    double consumption;
    double odometerR;
    double engine;

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getOdometerR() {
        return odometerR;
    }

    public void setOdometerR(double odometerR) {
        this.odometerR = odometerR;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getMilesPerGallon() {
        return getOdometer() / getConsumption();
    }

    ;


}
