package workshop.one.to.many.ex4;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @Column(name = "health_condition")
    private String healthCondition;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
