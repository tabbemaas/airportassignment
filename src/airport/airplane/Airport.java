package airport.airplane;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name = "";
    private Airplane[] airplanes;

    public String getName() {
        return name;
    }

    public void getAirplanes() {
            for (int i = 0; i < airplanes.length; i++) {
                System.out.println(airplanes[i].getPlaneIdentification());
            }
    }

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    public void AvailableAircraft() {
        for (int i = 0; i < airplanes.length; i++) {
            if (airplanes[i].getIsFlying() == false && (airplanes[i].getCapacity() > 0)) {
                System.out.println(airplanes[i].getPlaneIdentification() + " is available and has " + airplanes[i].getCapacity() + " spots available.");
            }
        }
    }

    public void loadPassengers(int numPassengers, Airplane airplane) {
        airplane.loadPassengers(numPassengers);
    }
}
