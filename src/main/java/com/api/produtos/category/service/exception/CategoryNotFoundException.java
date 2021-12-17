package com.api.produtos.category.service.exception;



public class CategoryNotFoundException extends  RuntimeException{
    private static final long serialVersionUID = 1L;

    public CategoryNotFoundException(String msg){
        super(msg);
    }

    public CategoryNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }

}
