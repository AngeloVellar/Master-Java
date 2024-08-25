package com.angelo.springboot.webapp.repositories;

import com.angelo.springboot.webapp.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {

}
