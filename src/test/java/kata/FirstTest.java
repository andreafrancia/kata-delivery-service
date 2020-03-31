package kata;

import org.junit.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void something() {
        var service = new DeliveryService();

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(emptyList(), result);
    }
}
