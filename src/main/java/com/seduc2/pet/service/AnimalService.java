package com.seduc2.pet.service;

import com.seduc2.pet.entity.Animal;
import com.seduc2.pet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }
    public List<Animal> mostrarAnimais(){
        List<Animal> animaisList = new ArrayList<>();
        return animaisList = repository.findAll();
    }
    public void cadastrarAnimsl(Animal animation){
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.isCastrado());
        animal.setObservacoes(animation.getObservacoes());
        animal.setEspecie(animation.getEspecie());
        animal.setSexo(animation.getSexo());
        animal.setRaca(animation.getRaca());
        animal.setDataNascimento(animation.getDataNascimento());
        animal.setCor(animation.getCor());
        animal.setVacinacao(animation.getVacinacao());
        animal.setPeso(animation.getPeso());

        repository.save(animal);
    }
}
