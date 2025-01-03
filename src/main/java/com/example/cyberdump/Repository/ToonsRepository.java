package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.Toons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRepository extends JpaRepository<Toons, Integer> {
    //Toons findById(ID id);
    Toons findByHandleIgnoreCase(String handle);
}
