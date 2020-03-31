package kata;

import org.junit.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public class DeliveryServiceTest {

    private final DeliveryService service = new DeliveryService();

    @Test
    public void noCollectionPoints() {

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(emptyList(), result);
    }
}