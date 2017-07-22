import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

//        File file = new File(".");
//        for (File f : file.listFiles()) {
//            if (f.getName().endsWith(".json")) {
//                // Now you have a File object named "f".
//                // You can use this to create a new instance of Scanner
//
//
//            }
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(vehicleInfo);
//
//        JSON to Java
//
//        ObjectMapper mapper = new ObjectMapper();
//        VehicleInfo vi = mapper.readValue(json, VehicleInfo.class);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        String formatDateTime = now.format(formatter);

        System.out.println("Current Time : " + formatDateTime);

    }
}
