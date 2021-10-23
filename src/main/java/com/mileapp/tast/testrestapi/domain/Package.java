package com.mileapp.tast.testrestapi.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "packages_doc")
public class Package {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "transacation_id", updatable = false, nullable = false)
    private UUID transaction_id;

    @NotBlank(message = "customer_name is mandatory")
    private String  customer_name;

    @NotBlank(message = "customer_code is mandatory")
    private String  customer_code;
    @NotBlank(message = "transaction_amount is mandatory")
    private String  transaction_amount;

    @NotBlank(message = "transaction_discount is mandatory")
    private String  transaction_discount;

    @NotBlank(message = "transaction_payment_type is mandatory")
    private String  ttransaction_payment_type;

    @NotBlank(message = "transaction_state is mandatory")
    private String  transaction_state;

    @NotBlank(message = "transaction_order is mandatory")
    private Long  transaction_order;

    @NotBlank(message = "location_id is mandatory")
    private String  location_id;

    @NotBlank(message = "organisation_id is mandatory")
    private Long  organisation_id;

    private Date  created_at;
    private Date  updated_at;

    @NotBlank(message = "transaction_paymetn_type_name is mandatory")
    private String  transaction_payment_type_name;

    @NotBlank(message = "transaction_cash_amount is mandatory")
    private Long  transaction_cash_amount;

    @NotBlank(message = "transaction_cash_change is mandatory")
    private Long  transaction_cash_change;

    @NotBlank(message = "customer_attribute is mandatory")
    private String  customer_attribute; // 
    
    @NotBlank(message = "connote is mandatory")
    private String  connote; // {}

    @NotBlank(message = "connote_id is mandatory")
    private String  connote_id;

    @NotBlank(message = "origin_data is mandatory")
    private String  origin_data; // {}

    @NotBlank(message = "destination_date is mandatory")
    private String  destination_data; // {}

    @NotBlank(message = "koli_data is mandatory")
    private String  koli_data; // [{}]

    @NotBlank(message = "customer_field is mandatory")
    private String  custome_field; // {}

    @NotBlank(message = "customer_location is mandatory")
    private String  current_location; // {}
}
