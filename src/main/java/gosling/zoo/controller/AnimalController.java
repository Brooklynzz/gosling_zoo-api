
package gosling.zoo.controller;

import gosling.zoo.animal.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {

    /**
     * PT-BR: Classe que recebe o métodos HTTP e executa uma função para salvar os dados do body (JSON) no banco de dados.
     * -----------------------------------------------------------------------------------------------------------------
     * EN: Class that receives the HTTP method and runs a function to save the data from the body (JSON) in database.
     */

    @Autowired
    private AnimalRepository repository;

    @PostMapping
    @Transactional
    public void animalRegister(@RequestBody @Valid AnimalRegister data) {
        repository.save(new Animal(data));
    }

    /**
     * PT-BR: Método HTTP que executa uma função para resgatar os dados do banco de dados.
     * -----------------------------------------------------------------------------------------------------------------
     * EN: HTTP method wich runs a function to receive data from the database.
     */

    @GetMapping
    public List<AnimalList> listAnimals() {
        return repository.findAll().stream().map(AnimalList::new).toList();
    }

    /**
     * PT-BR: Método HTTP para atualizar as informações dos animais no banco de dados.
     * -----------------------------------------------------------------------------------------------------------------
     * EN: HTTP method to update the data for the animals in database.
     * @param data
     */

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid AnimalUpdate data) {
        var animal = repository.getReferenceById(data.id());
        animal.updateData(data);
    }

    /**
     * PT-BR: Método HTTP para deletar animais com o id vindo do caminho.
     * -----------------------------------------------------------------------------------------------------------------
     * EN: HTTP method to delete animals from database based on the id that comes in the path.
     * @param id
     */

    @DeleteMapping({"/{id}"})
    @Transactional
    public void animalExclusion(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
