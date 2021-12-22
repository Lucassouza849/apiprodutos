package com.api.produtos.client.repository;

import com.api.produtos.address.domain.Address;
import com.api.produtos.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
