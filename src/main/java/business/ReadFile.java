package business;

import model.Bus;
import model.BusTrip;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<BusTrip> getBusTrips(String path) {
        List<BusTrip> busTrips = new ArrayList<>();
        try {
            File file = new File(path + "input.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] data = null;
                data = reader.nextLine().split(" ");
                if (LocalTime.parse(data[1]).plusHours(1).isAfter(LocalTime.parse(data[2]))) {
                    BusTrip busTrip = new BusTrip(Bus.getEnum(data[0]), LocalTime.parse(data[1]), LocalTime.parse(data[2]));
                    busTrips.add(busTrip);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return busTrips;
    }
}
