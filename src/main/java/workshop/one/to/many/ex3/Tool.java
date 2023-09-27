package workshop.one.to.many.ex3;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "tools")
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private Type type;
    @Column(name = "lending_date")
    private Date lendingDate;
    @Column(name = "returning_date")
    private Date returningDate;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
