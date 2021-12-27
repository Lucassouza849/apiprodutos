package com.api.produtos.address.domain;

import com.api.produtos.city.domain.City;
import com.api.produtos.client.domain.Client;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private City city;

    public Address(){}

    public Address(Integer id, String logradouro, String numero, String complemento, String bairro, String cep, Client client, City city) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.client = client;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id.equals(address.id) && Objects.equals(logradouro, address.logradouro) && Objects.equals(numero, address.numero) && Objects.equals(complemento, address.complemento) && Objects.equals(bairro, address.bairro) && Objects.equals(cep, address.cep) && Objects.equals(client, address.client) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
