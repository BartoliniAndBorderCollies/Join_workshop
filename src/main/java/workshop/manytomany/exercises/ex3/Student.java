package workshop.manytomany.exercises.ex3;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(mappedBy = "students")
    private List<Class> classes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
