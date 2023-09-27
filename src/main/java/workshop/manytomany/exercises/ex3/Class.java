package workshop.manytomany.exercises.ex3;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "class_name")
    private String className;
    @Column(name = "class_teacher")
    private String classTeacher;
    @ManyToMany
    @JoinTable(
            name = "classes_students",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
