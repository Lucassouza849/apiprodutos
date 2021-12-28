package com.api.produtos.payment.domain;

import com.api.produtos.order.domain.Order;
import com.api.produtos.payment.domain.enums.PaymentStatus;

import javax.persistence.Entity;
import java.time.OffsetDateTime;

@Entity
public class PaymentWithTicket extends Payment{
    private static final long serialVersionUID = 1L;


    private OffsetDateTime dueDate;
    private OffsetDateTime paymentDate;

    public PaymentWithTicket(){}

    public PaymentWithTicket(Integer id, PaymentStatus paymentStatus, Order order, OffsetDateTime dueDate, OffsetDateTime paymentDate) {
        super(id, paymentStatus, order);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public OffsetDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(OffsetDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
