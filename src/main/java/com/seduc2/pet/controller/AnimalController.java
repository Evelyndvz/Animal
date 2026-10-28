package com.seduc2.pet.controller;

import com.seduc2.pet.entity.Animal;
import com.seduc2.pet.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> mostrarAnimais() {
        return service.mostrarAnimais();
    }

    @PostMapping
    public void criarAnimal(@RequestBody Animal a) {
        service.cadastrarAnimsl(a);
    }
}
