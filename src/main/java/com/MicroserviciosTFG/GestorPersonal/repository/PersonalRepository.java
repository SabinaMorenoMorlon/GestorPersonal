package com.MicroserviciosTFG.GestorPersonal.repository;

import com.MicroserviciosTFG.GestorPersonal.entity.PersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository  extends JpaRepository<PersonalEntity, Integer> {
}
