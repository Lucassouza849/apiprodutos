package com.api.produtos.client.controller;

import com.api.produtos.client.domain.Client;
import com.api.produtos.client.repository.ClientRepository;
import com.api.produtos.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{id}")
    public ResponseEntity find(@PathVariable Integer id){
        Client client = clientService.clientSearch(id).get();
        return ResponseEntity.status(200).build();
    }

}
