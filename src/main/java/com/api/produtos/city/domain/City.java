package com.api.produtos.city.domain;

import com.api.produtos.state.domain.State;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private State state;

    public City(){}

    public City(Integer id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
}
