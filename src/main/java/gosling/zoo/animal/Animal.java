/**
 * PT-BR: Essa classe é o objeto animal que iremos persistir no banco de dados, ela possui anotações em lombok para deixar
 * o código menos verboso e também define automaticamente um id que será gerado no banco quando essa entidade for salva.
 * -----------------------------------------------------------------------------------------------------------------
 * EN: This is the animal object that we will save and read from the database, it utilizes lombok annotations to make
 * the code less verbose and also defines an id that will be generated once this entity is saved.
 */

package gosling.zoo.animal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "animals")
@Entity(name = "Animal")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String species;
    private String gender;
    private int age;

    @Enumerated(EnumType.STRING)
    private Habitat habitat;

    public Animal(AnimalRegister data) {
        this.name = data.name();
        this.species = data.species();
        this.gender = data.gender();
        this.age = data.age();
        this.habitat = data.habitat();
    }
}
