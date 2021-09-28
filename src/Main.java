public class Main {

    int x;
    int maxSpeedValue;
    public Main(int y, int speed)
    {
        x = y;
        maxSpeedValue = speed;
    }
    
    public static void main (String[] args)
    {
        Main firstMainObj = new Main(5, 200);
        Main secondMainbObj = new Main(25, 200);
        System.out.println(firstMainObj.x);
        System.out.println(secondMainbObj.x);

        myStaticMethod();
        Person aNewPerson = new Person();
        aNewPerson.setName("John");
        System.out.println(aNewPerson.getName());
        // Main tryingTocallANonstaticMethod = new Main();
        // tryingTocallANonstaticMethod.nonstaticMethod();
    }

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.print("Max speed is: "+  maxSpeed + "\n");
    }

    static void myStaticMethod() 
    {
        System.out.println("static method can be called without creating objects");
    }

    public void nonstaticMethod()
    {
        System.out.println("Public methods must be called by creating an object.");
    }

}
