/**
 * PT-BR: Classe que recebe o método HTTP e executa uma função para salvar os dados do body (JSON) no banco de dados.
 * -----------------------------------------------------------------------------------------------------------------
 * EN: Class that receives the HTTP method and runs a function to save the data from the body (JSON) in database.
 */

package gosling.zoo.controller;

import gosling.zoo.animal.Animal;
import gosling.zoo.animal.AnimalRegister;
import gosling.zoo.animal.AnimalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @PostMapping
    @Transactional
    public void animalRegister(@RequestBody @Valid AnimalRegister data) {
        repository.save(new Animal(data));
    }
}
