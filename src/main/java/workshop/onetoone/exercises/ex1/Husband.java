package workshop.onetoone.exercises.ex1;

import jakarta.persistence.*;

@Entity
@Table(name = "husbands")
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToOne (mappedBy = "husband")
    private Wife wife;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
