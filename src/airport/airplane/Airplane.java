package airport.airplane;

public class Airplane {
    private String planeIdentification = "unknown";
    private int maxPassengers = 0;
    private int currentPassengers = 0;
    private boolean isFlying = false;
    private int cruiseSpeed = 0;

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void loadPassengers(int numPassengers) {
        this.currentPassengers += numPassengers;
        System.out.println(this.getPlaneIdentification() + " has loaded " + numPassengers + " passengers.");
    }

    public void unloadPassengers(int numPassengers) {
        this.currentPassengers -= numPassengers;
        System.out.println(this.getPlaneIdentification() + " has unloaded " + numPassengers + " passengers.");
    }

    public void takeOff() {
        this.isFlying = true;
        System.out.println(this.getPlaneIdentification() + " has taken off.");
    }

    public void land() {
        this.isFlying = false;
        System.out.println(this.getPlaneIdentification() + " has landed.");
    }

    public Airplane(String identification){
        this.planeIdentification = identification;
    }
}
