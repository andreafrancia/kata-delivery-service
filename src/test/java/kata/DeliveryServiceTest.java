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

    @Test
    public void oneLocker() {
        service.addLocker("unes", 10);

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(List.of("unes"), result);
    }

    @Test
    public void lockerTooSmall() {
        service.addLocker("unes", 1);

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(emptyList(), result);
    }

    @Test
    public void twoLockers() {
        service.addLocker("small", 1);
        service.addLocker("big-enough", 10);

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(List.of("big-enough"), result);
    }

    @Test
    public void multipleBoxes() {
        service.addLocker("a-locker", 1, 10);

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(List.of("a-locker"), result);
    }

    @Test
    public void oneHub() {
        service.addHub("hub");

        List<String> result = service.collectionPointsForPackageOfSize(10);

        assertEquals(List.of("hub"), result);
    }
}
