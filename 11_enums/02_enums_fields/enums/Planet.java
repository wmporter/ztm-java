package enums;

public enum Planet {
    MERCURY("Mercury", 100),
    VENUS("Venus", 120),
    EARTH("Earth", 200),
    MARS("Mars", 250);
    
    private String name;
    private int distanceFromSun;
    
    Planet(String name, int distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getDistanceFromSun() {
        return this.distanceFromSun;
    }
}
