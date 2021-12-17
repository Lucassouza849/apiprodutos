package com.api.produtos.categoria.controller;

import com.api.produtos.categoria.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1, "i");
        Categoria cat2 = new Categoria(2, "drogas");

        List<Categoria> lista = new ArrayList();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}
