package kata;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<String> lockers = new ArrayList<>();
    private int box;

    public void addLocker(String name, int box) {
        this.box = box;
        lockers.add(name);
    }

    public List<String> collectionPointsForPackageOfSize(int packageSize) {
        var result = new ArrayList<String>();
        if(box >= packageSize)
            result.addAll(lockers);
        return result;
    }

}
