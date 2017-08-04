public class VehicleInfo {

    String VIN;
    double odometer;
    double consumption;
    double odometerR;
    double engine;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
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
