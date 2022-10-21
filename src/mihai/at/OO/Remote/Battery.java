package mihai.at.OO.Remote;

public class Battery {

    private double capacity;
    private double currentEnergy;

    public Battery(int capacity, int currentEnergy) {
        this.capacity = capacity;
        this.currentEnergy = currentEnergy;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(double currentEnergy) {
        this.currentEnergy = currentEnergy;
    }
}
