public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck = new Truck("truck", 6);
        Transport truck2 = new Truck("truck", 8);
        Transport bicycle = new Bicycle("bicycle", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        car.doService();
        car2.doService();
        truck.doService();
        truck2.doService();
        bicycle.doService();
        bicycle2.doService();
    }
}