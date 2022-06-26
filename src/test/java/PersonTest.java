import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void testT1() {
        boolean result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void testT2() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void testT3() {
        boolean result = Person.isTeenager(15);
        assertTrue(result);
    }

    @Test
    public void testF1() {
        boolean result = Person.isTeenager(20);
        assertFalse(result);
    }

    @Test
    public void testF2() {
        boolean result = Person.isTeenager(12);
        assertFalse(result);
    }

    @Test
    public void testF3() {
        boolean result = Person.isTeenager(90);
        assertFalse(result);
    }
}