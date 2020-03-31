package kata;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<String> lockers = new ArrayList<>();
    private int box;

    public List<String> collectionPointsForPackageOfSize(int i) {
        var result = new ArrayList<String>();
        if(box >= i)
            result.addAll(lockers);
        return result;
    }

    public void addLocker(String name, int box) {
        this.box = box;
        lockers.add(name);
    }
}
