package com.api.produtos.category.domain;


import com.api.produtos.product.domain.Products;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @JsonManagedReference
    @ManyToMany(mappedBy = "category")
    private List<Products> products = new ArrayList();

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category categoria = (Category) o;
        return Objects.equals(id, categoria.id) && Objects.equals(name, categoria.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
