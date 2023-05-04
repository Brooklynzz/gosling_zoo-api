/**
 * PT-BR: Interface que facilita a utilização do CRUD, não sendo necessário a escrita de consultas SQL manualmente, isso é
 * possível graças ao JPA.
 * -----------------------------------------------------------------------------------------------------------------
 * EN: interface wich makes easier to use CRUD, thanks to JPA we don't need to write SQL manually
 */

package gosling.zoo.animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
