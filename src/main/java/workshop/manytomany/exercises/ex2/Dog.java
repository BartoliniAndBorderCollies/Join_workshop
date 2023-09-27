package workshop.manytomany.exercises.ex2;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "dog")
    private List<DogsToys> dogsToysListInfoDogs;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
