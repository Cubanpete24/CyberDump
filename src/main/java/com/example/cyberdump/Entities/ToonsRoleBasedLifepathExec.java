package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_exec")
public class ToonsRoleBasedLifepathExec {
    @Id
    private Long toon_id;
}