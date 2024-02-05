import org.example.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testisTeenagerValidAge() {
        boolean result = Person.isTeenager(17);
        assertTrue(result);

        result = Person.isTeenager(13);
        assertTrue(result);

        result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void testisTeenagerInvalidAge() {
        boolean result = Person.isTeenager(9);
        assertFalse(result);

        result = Person.isTeenager(25);
        assertFalse(result);

    }
}