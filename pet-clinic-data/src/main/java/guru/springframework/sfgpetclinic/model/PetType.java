package guru.springframework.sfgpetclinic.model;


public class PetType {


    //@Column(name = "name")
    private String name;


    @Override
    public String toString() {
        return name;
    }
}
