public class Car extends AvtoMotoBicicleTruck {
    private final String[] tyre = {"Переднее правое", "Переднее левое",
            "Заднее левое", "Заднее правое", "Запосное"};
    public Car(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }

    public void updateTyre(int i) {
        System.out.println("Меняем покрышку " + tyre[i]);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель по чек-листу для машины");
    }
}