package org.auctionsense.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    private Long id;
    @NotBlank
    private String name;
    @ManyToMany(mappedBy = "genres", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Category> categories = new HashSet<>();

    public Genre() {
        super();
    }

    public Genre(String name) {
        this.name = name;
    }

    public Genre(String name, Set<Category> categories) {
        this.name = name;
        this.categories = categories;
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
    
    public Set<Category> getCategories() {
        return categories;
    }
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
