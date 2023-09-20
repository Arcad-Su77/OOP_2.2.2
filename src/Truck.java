public final class Truck extends AvtoMotoBicicleTruck {
    private final String[] tyre = {"Переднее правое", "Переднее левое",
            "Заднее правое внутреннее", "Заднее правое внешнее",
            "Заднее левое внутреннее", "Заднее левое внешнее"};
    public Truck(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }

    public void updateTyre(int i) {
        System.out.println("Меняем покрышку " + tyre[i]);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп по чек-листу для грузовика ");
    }
}