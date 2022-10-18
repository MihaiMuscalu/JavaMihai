package OO.Lamp;

public class Glowelement {

    private String name;
    private String color;
    private boolean active;


    public Glowelement(String name, String color) {
        this.name = name;
        this.color = color;
        this.active = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void turnOn()
    {
        active = true;
    }

    public void turnOff()
    {
        active = false;
    }
}
