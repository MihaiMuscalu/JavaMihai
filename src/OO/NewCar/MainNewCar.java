package OO.NewCar;



public class MainNewCar {
    public static void main(String[] args) {
        Producer p1 = new Producer("Mueller", "Germany", 0.98);
        NEngine e1 = new NEngine(10);
        NCar c1 = new NCar("blue", 180, 50000,1000,6,e1,p1);

        System.out.println(c1.getPrice());
        System.out.println(c1.getConsumption());
    }

}
