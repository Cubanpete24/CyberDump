package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.NetrunnerPrograms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetrunnerProgramsRepository extends JpaRepository<NetrunnerPrograms, Integer> {

}
