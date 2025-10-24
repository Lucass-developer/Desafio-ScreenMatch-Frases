package br.com.lucassdev.ScreenMatchFrases.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucassdev.ScreenMatchFrases.dto.FraseDTO;
import br.com.lucassdev.ScreenMatchFrases.model.Frase;
import br.com.lucassdev.ScreenMatchFrases.repository.FraseRepository;

@Service
public class FraseServices {
    @Autowired
    private FraseRepository frasesRepository;

    public FraseDTO obterFraseAleatoria(){
        List<Frase> frases = frasesRepository.findAll();
        Long randomIndex = new Random().nextLong(frases.size());
        Frase fraseAleatoria = frasesRepository.findById(randomIndex).orElse(null);
        if(fraseAleatoria != null){
            Frase frase = new Frase(fraseAleatoria.getFrase(), fraseAleatoria.getPersonagem(), fraseAleatoria.getTitulo(), fraseAleatoria.getPoster());
            return new FraseDTO(frase);
        }
        return null;
    }
}
