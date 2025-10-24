package br.com.lucassdev.ScreenMatchFrases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucassdev.ScreenMatchFrases.dto.FraseDTO;
import br.com.lucassdev.ScreenMatchFrases.services.FraseServices;

@RestController
public class FraseController {
    @Autowired
    private FraseServices fraseServices;
    
    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return fraseServices.obterFraseAleatoria();
    }
}
