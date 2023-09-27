package workshop.manytomany.exercises.ex4;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "students")
    private List<ClassesStudents> classesStudentsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
