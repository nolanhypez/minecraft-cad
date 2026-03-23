import com.nolanhypez.cad.model.CADLocation;

public class LocationManager {

    // Your existing code, updated to use CADLocation instead of Location
    private CADLocation currentLocation;
    
    // Example methods that use CADLocation
    public void setCurrentLocation(CADLocation location) {
        this.currentLocation = location;
    }

    public CADLocation getCurrentLocation() {
        return currentLocation;
    }

    // More code...
}