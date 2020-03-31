package kata;

import java.util.ArrayList;
import java.util.List;

class Locker
{
    final String name;
    final int box;

    public Locker(String name, int box) {
        this.name = name;
        this.box = box;
    }
}
public class DeliveryService {
    private List<Locker> lockers2 = new ArrayList<>();
    private int box;

    public void addLocker(String name, int box) {
        this.box = box;
        lockers2.add(new Locker(name, box));
    }

    public List<String> collectionPointsForPackageOfSize(int packageSize) {
        var result = new ArrayList<String>();
        for(Locker locker: lockers2) {
            if (box >= packageSize)
                result.add(locker.name);
        }
        return result;
    }

}
