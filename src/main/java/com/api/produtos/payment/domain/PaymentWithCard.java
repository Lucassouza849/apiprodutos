package com.api.produtos.payment.domain;

import com.api.produtos.order.domain.Order;
import com.api.produtos.payment.domain.enums.PaymentStatus;

import javax.persistence.Entity;

@Entity
public class PaymentWithCard extends Payment{
    private static final long serialVersionUID = 1L;

    //numero de parcelas
    private Integer numberInstallments;

    public PaymentWithCard(){}

    public PaymentWithCard(Integer id, PaymentStatus paymentStatus, Order order, Integer numberInstallments) {
        super(id, paymentStatus, order);
        this.numberInstallments = numberInstallments;
    }

    public Integer getNumberInstallments() {
        return numberInstallments;
    }

    public void setNumberInstallments(Integer numberInstallments) {
        this.numberInstallments = numberInstallments;
    }
}
