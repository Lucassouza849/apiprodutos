package com.api.produtos.client.domain;

import com.api.produtos.client.domain.enums.TypeClient;
import com.api.produtos.address.domain.Address;
import com.api.produtos.order.domain.Order;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String cpfOrCnpj;
    private Integer type;

    @JsonManagedReference
    @OneToMany(mappedBy = "client")
    private List<Address> address = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "telephone")
    private Set<String> telephone = new HashSet<>();

    @OneToMany(mappedBy = "client")
    List<Order> orders = new ArrayList<>();

    public Client(){}

    public Client(Integer id, String name, String email, String cpfOrCnpj, TypeClient type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpfOrCnpj = cpfOrCnpj;
        this.type = type.getCod();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public TypeClient getType() {
        return TypeClient.toEnum(type);
    }

    public void setType(TypeClient type) {
        this.type = type.getCod();
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Set<String> getTelephone() {
        return telephone;
    }

    public void setTelephone(Set<String> telephone) {
        this.telephone = telephone;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
