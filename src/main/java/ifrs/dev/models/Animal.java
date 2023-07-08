package ifrs.dev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String breed;
    
    @ManyToOne
    private Tutor tutor;

    public Animal() {
         // Construtor vazio
    }
    
    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    @Override
    public String toString() {
        return "Animal{name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}