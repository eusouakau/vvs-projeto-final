package ifrs.dev;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ifrs.dev.models.Animal;
import ifrs.dev.models.Tutor;

public class TutorTest {

    private Tutor tutor;
    private Animal animal1;
    private Animal animal2;

    @BeforeEach
    public void setup() {
        tutor = new Tutor("Maria", "maria@tst.com");
        animal1 = new Animal("Luci", "Dog");
        animal2 = new Animal("Max", "Cat");
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
    public void testGetAnimals() {
        tutor.addAnimal(animal1);
        tutor.addAnimal(animal2);

        List<Animal> animals = tutor.getAnimals();

        Assertions.assertNotNull(animals);
        Assertions.assertEquals(2, animals.size());
        Assertions.assertTrue(animals.contains(animal1));
        Assertions.assertTrue(animals.contains(animal2));
    }

    @Test
    public void testAddAnimal() {
        List<Animal> animals = tutor.getAnimals();
        Assertions.assertNotNull(animals);
        Assertions.assertEquals(0, animals.size());

        tutor.addAnimal(animal1);
        Assertions.assertEquals(1, animals.size());
        Assertions.assertTrue(animals.contains(animal1));

        tutor.addAnimal(animal2);
        Assertions.assertEquals(2, animals.size());
        Assertions.assertTrue(animals.contains(animal2));
    }

    @Test
    public void testToString() {
        Tutor tutor = new Tutor("Maria", "maria@tst.com");

        String expected = "Tutor{name='Maria', email='maria@tst.com'}";
        String actual = tutor.toString();
        Assertions.assertEquals(expected, actual);
    }

}

