package business;

import model.BusTrip;

import java.util.Collections;
import java.util.List;

public class Solver {
    public static void solve(List<BusTrip> busTrips) {
        Collections.sort(busTrips);
        int i = 0;
        while (i < busTrips.size() - 1) {
            if (isMoreEffective(busTrips.get(i), busTrips.get(i+1))) {
                busTrips.remove(i);
                i = i == 0 ? 0 : i - 1;
            } else {
                i++;
            }
        }
    }

    private static boolean isMoreEffective(BusTrip current, BusTrip next) {
        return (next.getEnd().isBefore(current.getEnd()) || next.getEnd().compareTo(current.getEnd()) == 0);
    }
}
