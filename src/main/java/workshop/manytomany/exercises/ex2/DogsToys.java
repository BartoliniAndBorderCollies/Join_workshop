package workshop.manytomany.exercises.ex2;

import jakarta.persistence.*;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dogs_toys")
public class DogsToys {
//    solution 1: pierwsza klasa > n:1 - klasą środkową - 1:n < druga klasa - czyli robienie de facto trzech Encji
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dog_id")
    private Dog dog;

    @ManyToOne
    @JoinColumn(name = "toy_id")
    private Toy toy;

    @Column(name = "last_used")
    private LocalDateTime lastUsed;

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
