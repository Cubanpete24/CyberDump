package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Armor;
import com.example.cyberdump.Entities.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {

}