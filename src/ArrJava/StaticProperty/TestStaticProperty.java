package ArrJava.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mec", "máy");
        System.out.println(car1.numberOfCar);
        Car car2 = new Car("BMW", "máy");
        System.out.println(car2.numberOfCar);
    }
}
