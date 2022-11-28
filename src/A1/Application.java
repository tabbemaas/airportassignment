package A1;

import airport.airplane.Airplane;

public class Application {
    public static void main(String[] args) {
        Airplane KLM644 = new Airplane("KLM644", 250);
        Airplane KLM887 = new Airplane("KLM887", 300);
        KLM644.loadPassengers(50);
        KLM887.loadPassengers(75);
        KLM644.takeOff();
        KLM887.takeOff();
        KLM644.unloadPassengers(24);
        KLM887.unloadPassengers(55);
        KLM644.land();
        KLM887.land();
    }
}
