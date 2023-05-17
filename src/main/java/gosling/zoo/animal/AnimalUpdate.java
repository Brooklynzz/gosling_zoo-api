package gosling.zoo.animal;

import jakarta.validation.constraints.NotNull;

public record AnimalUpdate(
        @NotNull
        Long id,
        String name,
        String species,
        String gender,
        int age,
        Habitat habitat) {
}
