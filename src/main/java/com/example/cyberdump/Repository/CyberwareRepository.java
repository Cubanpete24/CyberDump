package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.Cyberware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberwareRepository extends JpaRepository<Cyberware, Integer> {
    //Cyberware findByCyberware_nameIgnoreCase(String cyberware_name);

}
