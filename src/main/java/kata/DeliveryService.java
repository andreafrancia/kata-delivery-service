package kata;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<CollectionPoint> collectionPoints = new ArrayList<>();

    public void addLocker(String name, int... boxes) {
        collectionPoints.add(new CollectionPoint(name, new Boxes(boxes)));
    }

    public void addHub(String name) {
        collectionPoints.add(new CollectionPoint(name, new Hub()));
    }

    public List<String> collectionPointsForPackageOfSize(int packageSize) {
        var result = new ArrayList<String>();
        for(CollectionPoint collectionPoint : collectionPoints) {
            if (collectionPoint.canAcceptPackageOfSize(packageSize))
                result.add(collectionPoint.name);
        }
        return result;
    }

}
