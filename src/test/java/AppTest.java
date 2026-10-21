
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, app.multiply(3, 4));
    }
}
