package guru.springframework.sfgpetclinic.model;


import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
