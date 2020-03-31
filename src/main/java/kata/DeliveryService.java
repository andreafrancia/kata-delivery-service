package kata;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<Locker> lockers = new ArrayList<>();

    public void addLocker(String name, int box) {
        lockers.add(new Locker(name, box));
    }

    public List<String> collectionPointsForPackageOfSize(int packageSize) {
        var result = new ArrayList<String>();
        for(Locker locker: lockers) {
            if (locker.canAcceptPackageOfSize(packageSize))
                result.add(locker.name);
        }
        return result;
    }

}
