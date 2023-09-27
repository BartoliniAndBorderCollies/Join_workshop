package workshop.manytomany.exercises.ex4;


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
    @OneToMany(mappedBy = "classes")
    private List<ClassesStudents> classesStudentsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
