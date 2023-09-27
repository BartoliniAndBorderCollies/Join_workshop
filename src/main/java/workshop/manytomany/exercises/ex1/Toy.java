package workshop.manytomany.exercises.ex1;

import jakarta.persistence.*;
import workshop.manytomany.exercises.ex1.Dog;

import java.util.List;

@Entity
@Table(name = "toys")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;
    private String color;

    @ManyToMany
    @JoinTable( // czyli tą adnotacją tworzymy de facto trzecią tabelę
            name = "dogs_toys",
            joinColumns = @JoinColumn(name = "toy_id"), // tutaj musi być klasa w której jestem
            inverseJoinColumns = @JoinColumn(name = "dog_id")
    )
    private List<Dog> dogs;

    // jak to wygląda na BD:
    // pierwsza klasa > n:1 - klasą środkową - 1:n < druga klasa

    // Hibernate ma dwie opcje:
    // solution 1: pierwsza klasa > n:1 - klasą środkową - 1:n < druga klasa - czyli robienie de facto trzech Encji
    // solution 2: @ManyToMany -> mamy wtedy dwie klasy zamiast trzech - to jest ta opcja tutaj




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
