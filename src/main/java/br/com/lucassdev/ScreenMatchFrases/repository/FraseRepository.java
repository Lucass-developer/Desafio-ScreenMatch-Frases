package br.com.lucassdev.ScreenMatchFrases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucassdev.ScreenMatchFrases.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long> {

}
