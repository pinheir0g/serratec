package br.org.serratec.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.biblioteca.entities.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>{

}
