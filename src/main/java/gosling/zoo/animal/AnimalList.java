package gosling.zoo.animal;

public record AnimalList(
        Long id,
        String name,
        String species,
        String gender,
        int age,
        Habitat habitat) {

    public AnimalList(Animal animal) {
        this(animal.getId(), animal.getName(), animal.getSpecies(), animal.getGender(), animal.getAge(), animal.getHabitat());
    }
}
