package maratk.demo.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class FullName implements Serializable {
    private String name;
    private String surname;
    private int age;
}
