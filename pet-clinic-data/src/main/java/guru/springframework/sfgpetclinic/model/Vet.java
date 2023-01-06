package guru.springframework.sfgpetclinic.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>(); // Vet has a Set of Specialities
}
