/**
 * PT-BR: Esse é o record que recebe os dados da API.
 * -----------------------------------------------------------------------------------------------------------------
 * En: This is the record wich receives the API data.
 */

package gosling.zoo.animal;

public record AnimalRegister(
        String name,
        String species,
        String gender,
        int age,
        Habitat habitat
) {
}
