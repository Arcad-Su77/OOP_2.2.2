public interface ServiceStationInterfice {
    void check(Car car);
    void check(Truck truck);
    void check(Bicycle bicycle);

    default void check(AvtoMotoBicicleTruck AT){
        if (AT instanceof Car) check((Car) AT);
        if (AT instanceof Truck) check((Truck) AT);
        if (AT instanceof Bicycle) check((Bicycle) AT);
    }
}
