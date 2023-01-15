package org.auctionsense.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

public class Category extends PanacheEntity{
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String name;

    public Category() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
