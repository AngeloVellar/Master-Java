package com.sistema.trailers.repositories;
import com.sistema.trailers.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula,Integer> {
}
