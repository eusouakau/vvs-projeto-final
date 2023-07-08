package ifrs.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ifrs.dev.models.Animal;
import ifrs.dev.models.Tutor;

public class AnimalTest {

    private Animal animal;
    private Tutor tutor;

    @BeforeEach
    public void setup() {
        animal = new Animal("Luci", "Dog");
        tutor = new Tutor("Maria", "maria@tst.com");
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
        Animal animal = new Animal("Luci", "Dog");
    
        String expected = "Animal{name='Luci', breed='Dog'}";
        String actual = animal.toString();
        Assertions.assertEquals(expected, actual);
    } 
    
    @Test
    public void testGetTutor() {
        animal.setTutor(tutor);
        Tutor retrievedTutor = animal.getTutor();
        Assertions.assertEquals(tutor, retrievedTutor);
    }

    @Test
    public void testSetTutor() {
        animal.setTutor(tutor);
        Tutor retrievedTutor = animal.getTutor();
        Assertions.assertEquals(tutor, retrievedTutor);

        Tutor newTutor = new Tutor("Joana", "joana@tst.com");
        animal.setTutor(newTutor);
        retrievedTutor = animal.getTutor();
        Assertions.assertEquals(newTutor, retrievedTutor);
    }
}
