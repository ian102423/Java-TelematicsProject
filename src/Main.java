import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleInfo vehInfo = new VehicleInfo();
        TelematicsService telSer = new TelematicsService();

        Scanner scanner1 = new Scanner(System.in);

        int whatIsVIN;
        double whatIsOdo;
        double whatIsConsum;
        double whatIsOdoR;
        double whatIsEngine;

        whatIsVIN = scanner1.nextInt();
        whatIsOdo = scanner1.nextDouble();
        whatIsConsum = scanner1.nextDouble();
        whatIsOdoR = scanner1.nextDouble();
        whatIsEngine = scanner1.nextDouble();

        vehInfo.setVIN(whatIsVIN);
        vehInfo.setOdometer(whatIsOdo);
        vehInfo.setConsumption(whatIsConsum);
        vehInfo.setOdometerR(whatIsOdoR);
        vehInfo.setEngine(whatIsEngine);

        telSer.report(vehInfo);
    }
}
