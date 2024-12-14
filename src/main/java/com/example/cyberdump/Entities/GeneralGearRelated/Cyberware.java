package com.example.cyberdump.Entities.GeneralGearRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberware")
public class Cyberware {

    @Id
    private Long cyberware_id;
    private String cyberware_name;
    private String cyberware_type;
    private String cyberware_type_id;

    private String install_type;
    private String description;
    private String cost;
    private String hl_avg;
    private String hl;


    public Long getCyberware_id() {
        return cyberware_id;
    }

    public void setCyberware_id(Long cyberware_id) {
        this.cyberware_id = cyberware_id;
    }

    public String getCyberware_name() {
        return cyberware_name;
    }

    public void setCyberware_name(String cyberware_name) {
        this.cyberware_name = cyberware_name;
    }

    public String getCyberware_type() {
        return cyberware_type;
    }

    public void setCyberware_type(String cyberware_type) {
        this.cyberware_type = cyberware_type;
    }

    public String getInstall_type() {
        return install_type;
    }

    public void setInstall_type(String install_type) {
        this.install_type = install_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getHl_avg() {
        return hl_avg;
    }

    public void setHl_avg(String hl_avg) {
        this.hl_avg = hl_avg;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getCyberware_type_id() {
        return cyberware_type_id;
    }

    public void setCyberware_type_id(String cyberware_type_id) {
        this.cyberware_type_id = cyberware_type_id;
    }
}
