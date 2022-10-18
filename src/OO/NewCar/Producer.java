package OO.NewCar;

public class Producer {
    private String name;
    private String countryOfOrigin;
    private double discount;

    public Producer(String name, String countryOfOrigin, double discount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
