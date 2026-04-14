import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StockAlertTest {

    @Test
    void testAlertTriggered() {
        assertTrue(StockAlert.checkAlert(150, 100));
    }

    @Test
    void testNoAlert() {
        assertFalse(StockAlert.checkAlert(80, 100));
    }

    @Test
    void testExactThreshold() {
        assertTrue(StockAlert.checkAlert(100, 100));
    }

    @Test
    void testAlertMessage() {
        String msg = StockAlert.getAlertMessage(120, 100);
        assertEquals("ALERT: Stock price reached threshold!", msg);
    }
}