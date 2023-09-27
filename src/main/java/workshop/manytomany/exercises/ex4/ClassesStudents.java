package workshop.manytomany.exercises.ex4;

import jakarta.persistence.*;

@Entity
@Table(name = "classes_students")
public class ClassesStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "classes_id")
    private Class classes;
    @ManyToOne
    @JoinColumn(name = "students_id")
    private Student students;

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Class getClasses() {
        return classes;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
