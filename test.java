import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    void testSum() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }

    @Test
    void testString() {
        String name = "FC Code";
        assertTrue(name.contains("FC"), "String should contain 'FC'");
    }

    @Test
    void testFailureExample() {
        int value = 10;
        assertNotEquals(5, value, "Value should not be 5");
    }
}
