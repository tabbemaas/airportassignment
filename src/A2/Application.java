package A2;

import airport.airplane.Airplane;

public class Application {
    public static void main(String[] args) {
        Airplane KLM001 = new Airplane("KLM001", 250);
        KLM001.loadPassengers(240);
        KLM001.takeOff();
        KLM001.loadPassengers(20);
        KLM001.takeOff();
    }
}