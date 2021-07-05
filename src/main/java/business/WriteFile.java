package business;

import model.Bus;
import model.BusTrip;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeAnswerInFile(List<BusTrip> busTrips) {
        try {
            FileWriter file = new FileWriter("output.txt");
            StringBuilder answerPosh = new StringBuilder();
            StringBuilder answerGrotty = new StringBuilder();
            for (BusTrip busTrip : busTrips){
                if (busTrip.getBus() == Bus.POSH) {
                    answerPosh.append(busTrip.toString());
                    answerPosh.append('\n');
                } else {
                    answerGrotty.append('\n');
                    answerGrotty.append(busTrip.toString());
                }
            }
            file.write(answerPosh.toString());
            file.write(answerGrotty.toString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
