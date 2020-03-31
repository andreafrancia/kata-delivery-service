package kata;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<String> lockers = new ArrayList<>();

    public List<String> collectionPointsForPackageOfSize(int i) {
        var result = new ArrayList<String>();
        result.addAll(lockers);
        return result;
    }

    public void addLocker(String name, int box) {
        lockers.add(name);
    }
}
