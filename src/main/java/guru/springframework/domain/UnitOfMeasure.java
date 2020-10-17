package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {
    private String description;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
        this.description = uom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
