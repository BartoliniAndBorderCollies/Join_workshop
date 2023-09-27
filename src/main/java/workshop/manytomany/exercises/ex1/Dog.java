package workshop.manytomany.exercises.ex1;

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
    @ManyToMany (mappedBy = "dogs")
    private List<Toy> toys;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
