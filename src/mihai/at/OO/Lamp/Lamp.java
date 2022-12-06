package mihai.at.OO.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Glowelement> glowElements = new ArrayList<>();
    private String name;
    private int powerConsumption;
    private boolean turnedOn;

    public Lamp(String name) {
        this.name = name;
        this.glowElements = new ArrayList<>();

    }

    public List<Glowelement> getGlowElements() {
        return glowElements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGlowElement(Glowelement glowelement) {
        this.glowElements.add(glowelement);
    }

    public void turnOn()
    {
        if(turnedOn)
        {
            System.out.println("My name is " + this.name + ". I already am turned on.");
        }
        else {turnedOn = true;}
    }
    public void turnOff()
    {
        turnedOn = false;
    }

    public void turnAllOn() {
        for (int i = 0; i < this.glowElements.size(); i++) {
            this.glowElements.get(i).turnOn();
            this.powerConsumption = powerConsumption * 5;
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < this.glowElements.size(); i++) {
            this.glowElements.get(i).turnOff();
        }
    }

    public double getOverallPowerUsage() {
       double OverallPowerUsage = 0;
        for (int i = 0; i < glowElements.size(); i++) {
            if(glowElements.get(i).isActive())
            {
                OverallPowerUsage += 5;
            }
        }
        return OverallPowerUsage;
    }

    public void printNameOfGlowElements() {

        for (int i = 0; i < glowElements.size(); i++) {
            System.out.println(glowElements.get(i).getName());
        }

    }


}