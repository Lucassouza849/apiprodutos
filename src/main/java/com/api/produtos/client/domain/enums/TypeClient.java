package com.api.produtos.client.domain.enums;

public enum TypeClient {
    PHISYCALPERSON(1, "Phisical Person"),
    LEGALPERSON(2, "legal Person");

    private int cod;
    private String description;

    TypeClient(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod(){
        return cod;
    }

    public String getDescription(){
        return description;
    }

    public static TypeClient toEnum(Integer cod){
        if (cod == null){
            return null;
        }

        for (TypeClient x : TypeClient.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
