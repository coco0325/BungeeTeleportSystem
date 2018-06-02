package slimelab.system.utils;

public class Warp {
	private String name;
	private Location location;
	
	public Warp(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
