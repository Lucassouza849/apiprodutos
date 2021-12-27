package com.api.produtos.client.service;

import com.api.produtos.category.domain.Category;
import com.api.produtos.category.service.exception.CategoryNotFoundException;
import com.api.produtos.client.domain.Client;
import com.api.produtos.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Optional<Client> clientSearch(Integer id){
        Optional<Client> clientSearch = clientRepository.findById(id);
        if(clientSearch.isEmpty()){
            throw new CategoryNotFoundException("Objeto do id " + id + " não encontrado" + "tipo " + Category.class.getName());
        }
        return clientSearch;
    }
}
