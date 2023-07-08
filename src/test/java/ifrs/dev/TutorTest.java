package ifrs.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ifrs.dev.models.Tutor;

public class TutorTest {

    private Tutor tutor;

    @BeforeEach
    public void setup() {
        tutor = new Tutor("Maria", "maria@tst.com");
    }

    @Test
    public void testGetName() {
        String name = tutor.getName();
        Assertions.assertEquals("Maria", name);
    }

    @Test
    public void testSetName() {
        tutor.setName("Joana");
        String name = tutor.getName();
        Assertions.assertEquals("Joana", name);
    }

    @Test
    public void testGetEmail() {
        String email = tutor.getEmail();
        Assertions.assertEquals("maria@tst.com", email);
    }

    @Test
    public void testSetEmail() {
        tutor.setEmail("joana@tst.com");
        String email = tutor.getEmail();
        Assertions.assertEquals("joana@tst.com", email);
    }

    @Test
    public void testToString() {
        Tutor tutor = new Tutor("Maria", "maria@tst.com");

        String expected = "Tutor{name='Maria', email='maria@tst.com'}";
        String actual = tutor.toString();
        Assertions.assertEquals(expected, actual);
    }

}

