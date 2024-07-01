package facade.beverage;

public enum Size {
    LARGE, MEDIUM, SMALL;

    public static Size fromString(String a) {
        if (a.equals("MEDIUM"))
            return MEDIUM;
        if (a.equals("SMALL"))
            return SMALL;
        if (a.equals("LARGE"))
            return LARGE;
        throw new IllegalArgumentException("No size valid");
    }
}