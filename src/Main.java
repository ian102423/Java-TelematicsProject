import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        TelematicsService telSer = new TelematicsService();
        VehicleInfo vehInfo = new VehicleInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Put VIN#");
        String input1 = scanner.next();
        System.out.println("Put Odometer");
        String input2 = scanner.next();
        System.out.println("Put Consumption");
        String input3 = scanner.next();
        System.out.println("Put last Oil change");
        String input4 = scanner.next();
        System.out.println("Put Engine Liters");
        String input5 = scanner.next();

        vehInfo.setVIN(Integer.parseInt(input1));
        vehInfo.setOdometer(Double.parseDouble(input2));
        vehInfo.setConsumption(Double.parseDouble(input3));
        vehInfo.setOdometerR(Double.parseDouble(input4));
        vehInfo.setEngine(Double.parseDouble(input5));

        telSer.report(vehInfo);


        File file = new File(".");
        for (File f : file.listFiles()) {
            if (f.getName().endsWith(".json")) {
                // Now you have a File object named "f".
                // You can use this to create a new instance of Scanner
            }
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        String formatDateTime = now.format(formatter);

        System.out.println("Current Time : " + formatDateTime);

    }
}
