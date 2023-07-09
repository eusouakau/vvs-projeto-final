package ifrs.dev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import ifrs.dev.models.Animal;
import ifrs.dev.models.Tutor;
import ifrs.dev.repositories.AnimalRepository;
import ifrs.dev.repositories.TutorRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalTutorComponentTest {

    @Mock
    private TutorRepository tutorRepository;

    @Mock
    private AnimalRepository animalRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateAnimalWithTutor() {
        Tutor tutor = new Tutor("Joao", "joao@tst.com");
        Animal animal = new Animal("Luci", "Dog");
        tutor.addAnimal(animal);

        Mockito.when(tutorRepository.findById(tutor.getId())).thenReturn(tutor);
        Mockito.doAnswer((Answer<Void>) invocation -> {
            Animal argAnimal = invocation.getArgument(0);
            animal.setId(argAnimal.getId());
            return null;
        }).when(animalRepository).persist(Mockito.any(Animal.class));

        animalRepository.persist(animal);

        Tutor persistedTutor = tutorRepository.findById(tutor.getId());
        assertNotNull(persistedTutor);
        assertEquals(1, persistedTutor.getAnimals().size());
        assertEquals(animal, persistedTutor.getAnimals().get(0));
    }

    @Test
    public void testCreateTutorWithAnimal() {
        Tutor tutor = new Tutor("Maria", "maria@tst.com");
        Animal animal = new Animal("Max", "Cat");
        animal.setTutor(tutor);

        Mockito.doAnswer((Answer<Void>) invocation -> {
            Tutor argTutor = invocation.getArgument(0);
            tutor.setId(argTutor.getId());
            return null;
        }).when(tutorRepository).persist(Mockito.any(Tutor.class));
        Mockito.when(animalRepository.findById(animal.getId())).thenReturn(animal);

        tutorRepository.persist(tutor);
        animalRepository.persist(animal);

        Animal persistedAnimal = animalRepository.findById(animal.getId());
        assertNotNull(persistedAnimal);
        assertNotNull(persistedAnimal.getTutor());
        assertEquals(tutor, persistedAnimal.getTutor());
    }
}
