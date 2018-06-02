package slimelab.system.utils;

import net.md_5.bungee.api.config.ServerInfo;

public class Location {
	
	private ServerInfo server;
	private String world;
	private double x,y,z;
	
	public Location(ServerInfo server, String world, double x, double y, double z) {
        this.server = server;
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }
	
    public ServerInfo getServer() {
        return server;
    }

    public String getWorld() {
        return world;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getXInt() {
        return (int) Math.floor(x);
    }

    public int getYInt() {
        return (int) Math.floor(y);
    }

    public int getZInt() {
        return (int) Math.floor(z);
    }
}
