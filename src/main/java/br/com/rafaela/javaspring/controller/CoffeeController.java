package br.com.rafaela.javaspring.controller;
import br.com.rafaela.javaspring.domain.*;

import java.util.List;
import java.util.Optional;

import br.com.rafaela.javaspring.repository.CoffeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    private CoffeeRepository coffeeRepository;

    @GetMapping
    public List<Coffee> getCoffees() {
        return coffeeRepository.getCoffees();
    }

    @GetMapping("/{id}")
    public Optional<Coffee> getCoffeeById(@PathVariable String id) {
        return coffeeRepository.getCoffeeById(id);
    }

    @PostMapping
    public Coffee createCoffee(@RequestBody Coffee coffee) {
        return coffeeRepository.createCoffee(coffee);
    }

    @PutMapping("/{id}")
    public Coffee updateCoffee(@PathVariable("id") String id, @RequestBody Coffee coffee) {
        return coffeeRepository.updateCoffee(id, coffee);
    }

    @DeleteMapping("/{id}")
    public void deleteCoffee(@PathVariable String id) {
        coffeeRepository.deleteCoffee(id);
    }
}