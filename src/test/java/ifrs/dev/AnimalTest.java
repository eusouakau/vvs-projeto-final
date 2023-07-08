package ifrs.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ifrs.dev.models.Animal;

public class AnimalTest {

    private Animal animal;

    @BeforeEach
    public void setup() {
        animal = new Animal("Luci", "Dog");
    }

    @Test
    public void testGetName() {
        String name = animal.getName();
        Assertions.assertEquals("Luci", name);
    }

    @Test
    public void testSetName() {
        animal.setName("Theo");
        String name = animal.getName();
        Assertions.assertEquals("Theo", name);
    }

    @Test
    public void testGetBreed() {
        String breed = animal.getBreed();
        Assertions.assertEquals("Dog", breed);
    }

    @Test
    public void testSetBreed() {
        animal.setBreed("Cat");
        String breed = animal.getBreed();
        Assertions.assertEquals("Cat", breed);
    }

    @Test
    public void testToString() {
        String expected = "Animal{nome='Luci', breed='Dog'}";
        String actual = animal.toString();
        Assertions.assertEquals(expected, actual);
    }
}
