package gosling.zoo.animal;

public record AnimalList(
        String name,
        String species,
        String gender,
        int age,
        Habitat habitat) {

    public AnimalList(Animal animal) {
        this(animal.getName(), animal.getSpecies(), animal.getGender(), animal.getAge(), animal.getHabitat());
    }
}
