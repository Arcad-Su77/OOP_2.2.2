import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        List<AvtoMotoBicicleTruck> avtoTrans = new ArrayList<>();
        avtoTrans.add(new Car("Audi", 5));
        avtoTrans.add(new Car("Mercedes", 5));
        avtoTrans.add(new Truck("MAN", 6));
        avtoTrans.add(new Truck("KAMAZ", 6));
        avtoTrans.add(new Bicycle("Olimp", 2));
        avtoTrans.add(new Bicycle("Sport", 2));

        for (AvtoMotoBicicleTruck AT : avtoTrans) {
            station.check(AT);
        }
    
    }
}