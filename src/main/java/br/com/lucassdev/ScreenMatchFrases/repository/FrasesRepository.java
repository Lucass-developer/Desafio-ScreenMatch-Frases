package br.com.lucassdev.ScreenMatchFrases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucassdev.ScreenMatchFrases.model.Frases;

public interface FrasesRepository extends JpaRepository<Frases, Long> {

}
