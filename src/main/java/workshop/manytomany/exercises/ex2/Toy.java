package workshop.manytomany.exercises.ex2;


import jakarta.persistence.*;

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

    @OneToMany (mappedBy = "toy")
    private List<DogsToys> dogsToysListInfoToys;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
