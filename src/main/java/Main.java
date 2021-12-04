public class Main {
    public static void main(String[] args) {

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));
        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);
        car2 = car1;
        car2.setNumber(5);
        System.out.println(car1.getNumber());
        System.out.println(car1 == car2);
        String brand = "BMW";
        System.out.println(car1.getBrand() == brand);

    }
}