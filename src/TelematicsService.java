import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TelematicsService {

    private ObjectMapper mapper = new ObjectMapper();

    double totOdometer = 0;
    double totConsumption = 0;
    double totLastOilChange = 0;
    double totEngineSize = 0;
    double totMpg = 0;

    public void report(VehicleInfo vehicleInfo) {
        try {
            String vehicleInfoJson = mapper.writeValueAsString(vehicleInfo);
            try (FileWriter out = new FileWriter(vehicleInfo.getVIN() + ".json")) {
                out.write(vehicleInfoJson);
                out.flush();
            }
        } catch (JsonProcessingException e) {
            System.out.println("Caught JsonProcessingException " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException " + e.getMessage());
        }

        List<VehicleInfo> vehicleInfos = new ArrayList<>();
        File files = new File(".");
        for (File f : files.listFiles()) {
            if (f.getName().endsWith(".json")) {
                // If there is an exception keep going with the next one
                File file = new File(f.getName());
                try (Scanner scanner = new Scanner(file)) {
                    String vehicleInfoJson = scanner.nextLine();
                    vehicleInfo = mapper.readValue(vehicleInfoJson, VehicleInfo.class);
                    vehicleInfos.add(vehicleInfo);
                } catch (JsonParseException e) {
                    System.out.println("Caught JsonParseException " + e.getMessage());
                } catch (JsonMappingException e) {
                    System.out.println("Caught JsonMappingException " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("Caught IOException " + e.getMessage());
                }
            }
        }

        for (VehicleInfo Info : vehicleInfos) {
            totOdometer += Info.getOdometer();
            totConsumption += Info.getConsumption();
            totEngineSize += Double.valueOf(Info.getEngine());
            totLastOilChange += Info.getOdometerR();
            totMpg += Info.getMilesPerGallon();
        }

        int total = vehicleInfos.size();
        String html = Dashboard.dashboardTop.replace("%count%", String.valueOf(total));
        html = html.replace("%odometer%", String.format("%.1f", totOdometer / total));
        html = html.replace("%consumption%", String.format("%.1f", totConsumption / total));
        html = html.replace("%lastoilchange%", String.format("%.1f", totLastOilChange / total));
        html = html.replace("%enginesize%", String.format("%.1f", totEngineSize / total));
        html = html.replace("%mpg%", String.format("%.1f", totMpg / total));

        StringBuilder htmlPage = new StringBuilder(html);

        for (VehicleInfo Info : vehicleInfos) {
            html = Dashboard.dashboardTable.replace("%vin%", Info.getVIN());
            html = html.replace("%odometer%", String.valueOf(Info.getOdometer()));
            html = html.replace("%consumption%", String.valueOf(Info.getConsumption()));
            html = html.replace("%lastoilchange%", String.valueOf(Info.getOdometerR()));
            html = html.replace("%enginesize%", String.format("%.1f", Double.valueOf(Info.getEngine())));
            html = html.replace("%mpg%", String.format("%.1f", Info.getMilesPerGallon()));

            htmlPage.append(html);
        }

        htmlPage.append(Dashboard.dashboardBottom);

        try (PrintWriter out = new PrintWriter("Dashboard.html")) {
            out.println(htmlPage.toString());
            out.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException (could not write dashbord.html) " + e.getMessage());
        }

        System.out.println("VIN: " + vehicleInfo.getVIN() + "\nOdometer: " +
                vehicleInfo.getOdometer() + "\nConsumption: " + vehicleInfo.getConsumption() + "\nLast Oil Change: "
                + vehicleInfo.getOdometerR() + "\nEngine Liters: " + vehicleInfo.getEngine() + "\nMPG: " + vehicleInfo.getMilesPerGallon());


    }
}

