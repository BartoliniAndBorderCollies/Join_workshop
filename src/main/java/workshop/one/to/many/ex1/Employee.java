package workshop.one.to.many.ex1;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    @OneToOne
    @JoinColumn(name = "parking_spot_id")
    private ParkingSpot parkingSpot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
