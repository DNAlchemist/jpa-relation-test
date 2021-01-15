package one.chest.jparelationtest.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_seq")
    @Column(name = "id")
    private Long id;

    @PrimaryKeyJoinColumn
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Phone> phones;
}
