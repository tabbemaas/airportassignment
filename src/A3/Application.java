package A3;

import airport.airplane.*;

public class Application {
    public static void main(String[] args) {
        Airplane KLM644 = new Airplane("KLM644", 250);
        Airplane KLM887 = new Airplane("KLM887", 300);
        Airplane KLM001 = new Airplane("KLM001", 400);
        Airport Schiphol = new Airport("Schiphol", new Airplane[]{KLM001, KLM644, KLM887});
        Schiphol.getAirplanes();
        Schiphol.AvailableAircraft();
        Schiphol.loadPassengers(100, KLM001);
        Schiphol.loadPassengers(350, KLM001);
    }
}
