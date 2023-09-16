public final class Truck extends AvtoMotoBicicleTruck {

    public Truck(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}