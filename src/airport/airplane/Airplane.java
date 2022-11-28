package airport.airplane;

public class Airplane {
    private String planeIdentification = "unknown";
    private int maxPassengers = 0;
    private int currentPassengers = 0;
    private boolean isFlying = false;
    private int cruiseSpeed = 0;
    private int capacity = maxPassengers - currentPassengers;

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCapacity() {
        return capacity;
    }


    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public boolean getIsFlying() {
        return isFlying;
    }

    public void loadPassengers(int numPassengers) {
        if (this.currentPassengers + numPassengers <= this.maxPassengers) {
            this.currentPassengers += numPassengers;
            System.out.println(this.getPlaneIdentification() + " has loaded " + numPassengers + " passengers.");
        }
        else if (this.currentPassengers + numPassengers > this.maxPassengers) {
            int excess = (this.currentPassengers + numPassengers - this.maxPassengers);
            int loaded = (this.maxPassengers - this.currentPassengers);
            this.currentPassengers = this.maxPassengers;
            System.out.println(this.getPlaneIdentification() +  " loaded " + loaded + " passengers, " + excess + " passengers didn't fit.");
        };
    }

    public void unloadPassengers(int numPassengers) {
        this.currentPassengers -= numPassengers;
        System.out.println(this.getPlaneIdentification() + " has unloaded " + numPassengers + " passengers.");
    }

    public void takeOff() {
        if (this.isFlying == true) {
            System.out.println(this.planeIdentification + " is already in the air!");
        } else {
            this.isFlying = true;
            System.out.println(this.getPlaneIdentification() + " has taken off.");
        }
    }

    public void land() {
        this.isFlying = false;
        System.out.println(this.getPlaneIdentification() + " has landed.");
    }

    public Airplane(String identification, int maxPassengers){
        this.planeIdentification = identification;
        this.maxPassengers = maxPassengers;
    }
}
