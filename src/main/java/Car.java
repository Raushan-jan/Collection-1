public class Car {
    private  String brand;
    private int number;

    public Car(String brend, int number) {
        this.brand = brend;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brend) {
        this.brand = brend;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
