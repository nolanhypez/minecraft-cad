package com.nolanhypez.cad.manager;

import java.util.ArrayList;
import java.util.List;

public class UnitManager {
    private List<String> emergencyUnits;

    public UnitManager() {
        this.emergencyUnits = new ArrayList<>();
    }

    public void addUnit(String unit) {
        emergencyUnits.add(unit);
    }

    public void removeUnit(String unit) {
        emergencyUnits.remove(unit);
    }

    public List<String> getUnits() {
        return new ArrayList<>(emergencyUnits);
    }

    public boolean isUnitAvailable(String unit) {
        return emergencyUnits.contains(unit);
    }
}