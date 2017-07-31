import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TelematicsService extends VehicleInfo {

//    private ObjectMapper mapper = new ObjectMapper();

    public void report(VehicleInfo vehicleInfo) {
//
//        try {
//            String vehicleInfoJson = mapper.writeValueAsString(vehicleInfo);
//            try (FileWriter out = new FileWriter(vehicleInfo.getVIN() + ".json")) {
//                out.write(vehicleInfoJson);
//                out.flush();
//            }
//        } catch (JsonProcessingException e) {
//            System.out.println("Caught JsonProcessingException " + e.getMessage());
//        } catch (FileNotFoundException e) {
//            System.out.println("Caught FileNotFoundException " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("Caught IOException " + e.getMessage());
//        }
//
//
//        List<VehicleInfo> vehicleInfos = new ArrayList<>();
//        File files = new File(".");
//        for (File f : files.listFiles()) {
//            if (f.getName().endsWith(".json")) {
//                // If there is an exception keep going with the next one
//                File file = new File(f.getName());
//                try (Scanner scanner = new Scanner(file)) {
//                    String vehicleInfoJson = scanner.nextLine();
//                    vehicleInfo = mapper.readValue(vehicleInfoJson, VehicleInfo.class);
//                    vehicleInfos.add(vehicleInfo);
//                } catch (JsonParseException e) {
//                    System.out.println("Caught JsonParseException " + e.getMessage());
//                } catch (JsonMappingException e) {
//                    System.out.println("Caught JsonMappingException " + e.getMessage());
//                } catch (IOException e) {
//                    System.out.println("Caught IOException " + e.getMessage());
//                }
//            }
//        }
//
////        // variable to keep a running total
////        double totOdometer = 0;
////        double totConsumption = 0;
////        double totLastOilChange = 0;
////        double totEngineSize = 0;
////        double totMpg = 0;
////
////        // calculate the totals
////        for (VehicleInfo vehicleInfo1 : vehicleInfos) {
////            totOdometer += vehicleInfo1.getOdometer();
////            totConsumption += vehicleInfo1.getConsumption();
////            totEngineSize += Double.valueOf(vehicleInfo1.getEngineSize());
////            totLastOilChange += vehicleInfo1.getOdometerReadingLastOilChange();
////            totMpg += vehicleInfo1.milesPerGallon();
////        }
//
//        // Write the top of the html that has the averages replacing the values surrounded by % with a number
//        int total = vehicleInfos.size();
//        String html = Dashboard.dashboardTop.replace("%count%", String.valueOf(total));
//        html = html.replace("%odometer%", String.format("%.1f", totOdometer / total));
//        html = html.replace("%consumption%", String.format("%.1f", totConsumption / total));
//        html = html.replace("%lastoilchange%", String.format("%.1f", totLastOilChange / total));
//        html = html.replace("%enginesize%", String.format("%.1f", totEngineSize / total));
//        html = html.replace("%mpg%", String.format("%.1f", totMpg / total));
//
//        StringBuilder htmlPage = new StringBuilder(html);
//
//        for (VehicleInfo vehicleInfo1 : vehicleInfos) {
//            html = Dashboard.dashboardTable.replace("%vin%", vehicleInfo1.getVIN());
//            html = html.replace("%odometer%", String.valueOf(vehicleInfo1.getOdometer()));
//            html = html.replace("%consumption%", String.valueOf(vehicleInfo1.getConsumption()));
//            html = html.replace("%lastoilchange%", String.valueOf(vehicleInfo1.getOdometerReadingLastOilChange()));
//            html = html.replace("%enginesize%", String.format("%.1f", Double.valueOf(vehicleInfo1.getEngineSize())));
//            html = html.replace("%mpg%", String.format("%.1f", vehicleInfo1.milesPerGallon()));
//
//            htmlPage.append(html);
//        }
//
//        htmlPage.append(Dashboard.dashboardBottom);
//
//        // Write the dashboard.html file
//        try (PrintWriter out = new PrintWriter("Dashboard.html")) {
//            out.println(htmlPage.toString());
//            out.flush();
//        } catch (FileNotFoundException e) {
//            System.out.println("Caught FileNotFoundException (could not write dashbord.html) " + e.getMessage());
//        }
//

        // update info
        System.out.println("VIN: " + vehicleInfo.getVIN() + "\nOdometer: " +
                vehicleInfo.getOdometer() + "\nConsumption: " + vehicleInfo.getConsumption() + "\nLast Oil Change: "
                + vehicleInfo.getOdometerR() + "\nEngine Liters: " + vehicleInfo.getEngine() + "\nMPG: " + vehicleInfo.getMilesPerGallon());


    }


    ;
}