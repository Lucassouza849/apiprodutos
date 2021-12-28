package com.api.produtos.payment.domain.enums;

import com.api.produtos.client.domain.enums.TypeClient;
import com.api.produtos.payment.domain.Payment;

public enum PaymentStatus {
    PENDING (1, "pendente"),
    SETTLED (2, "quitado"),
    CANCEL (3, "cancelado");

    private Integer cod;
    private String description;

    PaymentStatus(Integer cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static PaymentStatus toEnum(Integer cod){
        if (cod == null){
            return null;
        }

        for (PaymentStatus x : PaymentStatus.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }

}
