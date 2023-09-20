public class Car extends AvtoMotoBicicleTruck {
    public Car(String name, int i) {
        super();
        this.setModelName(name);
        this.setWheelsCount(i);
    }
    

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель по чек-листу для машины");
    }
}