public class Bicycle extends AvtoMotoBicicleTruck {
    private final String[] tyre = {"Переднее", "Заднее"};
    public Bicycle(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }

    public void updateTyre(int i) {
        System.out.println("Меняем покрышку " + tyre[i]);
    }


}