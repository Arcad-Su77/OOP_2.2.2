public class Bicycle extends AvtoMotoBicicleTruck {

    public Bicycle(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}