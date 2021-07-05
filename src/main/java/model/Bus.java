package model;


public enum Bus {
    POSH("Posh"), GROTTY("Grotty");

    private final String value;

    Bus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bus getEnum(String value) {
        for (Bus bus : values()) {
            if (value.equals(bus.value)) {
                return bus;
            }
        }
        throw new IllegalArgumentException("bus type not found");
    }
}
