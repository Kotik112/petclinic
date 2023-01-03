package guru.springframework.sfgpetclinic.model;


public class PetType extends BaseEntity{


    //@Column(name = "name")
    private String name;


    @Override
    public String toString() {
        return name;
    }
}
