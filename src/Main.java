public class Main {
    public static void main(String[] args) {
        Car car = new Car("KIA", 1);
        Truck truck = new Truck("BELAZ", 1);
        Bicycle bicycle = new Bicycle("BMX", 1);

        car.setModelName("Машина");
        car.setWheelsCount(4);
        truck.setModelName("Трэкол");
        truck.setWheelsCount(6);
        bicycle.setModelName("Велосипед");
        bicycle.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(null, bicycle, null);
        station.check(null, null, truck);
    }
}