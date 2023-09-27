package workshop.onetoone.exercises.ex1;

import jakarta.persistence.*;

@Entity
@Table(name = "wives")
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String heels;

    @OneToOne
    @JoinColumn (name = "husband_id")
    private Husband husband;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
