package com.alternanza.negozio.repository;

import com.alternanza.negozio.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoloRepository extends JpaRepository <Articolo, Integer> {
}
