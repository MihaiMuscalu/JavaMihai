package OO.Remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {


    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public double getStatus() {
        double currentEnergy1 = this.batteries.get(0).getCurrentEnergy();
        double currentEnergy2 = this.batteries.get(1).getCurrentEnergy();

        //CurrentEnergySum = CES
        double CES = ((currentEnergy1 + currentEnergy2) / 2) / 100;

        return CES;
    }

    public void turnOn() {
        this.batteries.get(0).setCurrentEnergy(this.batteries.get(0).getCapacity() - this.batteries.get(0).getCapacity() * 0.05);
        this.batteries.get(1).setCurrentEnergy(this.batteries.get(1).getCapacity() - this.batteries.get(1).getCapacity() * 0.05);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
