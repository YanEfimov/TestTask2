package model;

import java.time.LocalTime;


public class BusTrip implements Comparable<BusTrip> {
    private Bus bus;
    private LocalTime start;
    private LocalTime end;

    public BusTrip(Bus bus, LocalTime start, LocalTime end) {
        this.bus = bus;
        this.start = start;
        this.end = end;
    }

    public Bus getBus() {
        return bus;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    @Override
    public int compareTo(BusTrip o) {
        if (start.compareTo(o.start) == 0) {
            if (end.compareTo(o.end) == 0) {
                return bus == Bus.POSH ? 1 : -1;
            }
            return o.end.compareTo(end);
        }
        return start.compareTo(o.start);
    }

    @Override
    public String toString() {
        return bus.getValue() + " " + start + " " + end;
    }
}
