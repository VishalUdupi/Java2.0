package Java2.O;

public class InstanceOf {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car instanceof Vehicle);
    }
}

class Vehicle{
    int id;
}
class Car extends Vehicle{

}