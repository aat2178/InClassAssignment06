package com.example.takehomeassignment06;

import java.io.Serializable;

public class Receipt implements Serializable {

    int receiptAmount;
    double receiptTax;
    double receiptTip;

    public Receipt(int amount, double tax, double tip){
        receiptAmount = amount;
        receiptTax = tax;
        receiptTip = tip;
    }

}

