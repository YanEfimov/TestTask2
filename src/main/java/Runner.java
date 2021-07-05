import business.ReadFile;
import business.Solver;
import business.WriteFile;
import model.BusTrip;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        List<BusTrip> busTrips = ReadFile.getBusTrips(args[0]);
        Solver.solve(busTrips);
        WriteFile.writeAnswerInFile(busTrips);
    }
}
