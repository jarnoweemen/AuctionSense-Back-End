package org.auctionsense.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @Column(precision = 6, scale = 2)    
    private BigDecimal price;
    private Integer views;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "category_id_fk"))
    @JsonIgnore
    private Category category;

    public Product() {
        super();
    }

    public Product(String name, String description, BigDecimal price, Integer views) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.views = views;
    }
    
    public Product(String name, String description, BigDecimal price, Integer views, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.views = views;
        this.category = category;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getViews() {
        return views;
    }
    public void setViews(Integer views) {
        this.views = views;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
