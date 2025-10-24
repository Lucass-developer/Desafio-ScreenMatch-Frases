package br.com.lucassdev.ScreenMatchFrases.dto;

import br.com.lucassdev.ScreenMatchFrases.model.Frase;

public record FraseDTO(String frase, String personagem, String titulo, String poster) {
    public FraseDTO(Frase frase){
        this(frase.getFrase(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
