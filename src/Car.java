import com.vehicle.Main;


public class Car extends Main {
    private String modelName = "Mustang";
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
