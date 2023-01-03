package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet extends BaseEntity {

    //@Column(name = "name")
    private String name;

    //@ManyToOne
    //@JoinColumn(name = "type_id")
    private PetType petType;

    //@ManyToOne
    //@JoinColumn(name = "owner_id")
    private Owner owner;

    private LocalDate birthDate;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")

}
