package com.nolanhypez.cad.manager;

import java.util.HashMap;
import java.util.Map;

public class LocationManager {
    private Map<String, Location> locations;

    public LocationManager() {
        locations = new HashMap<>();
    }

    public void addLocation(String name, Location location) {
        locations.put(name, location);
    }

    public Location getLocation(String name) {
        return locations.get(name);
    }

    public void removeLocation(String name) {
        locations.remove(name);
    }

    // other relevant methods
}