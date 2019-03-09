package com.example.takehomeassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int amountInput;
    double taxPercentage;
    double tipPercentage;

    public void getAmount() {
        EditText getInputText = (EditText) findViewById(R.id.amount);
        String amountString = getInputText.getText().toString();

        if (amountString.length() == 0) {
            amountInput = 0;
        } else {
            amountInput = Integer.parseInt(amountString);
        }

    }

    public void getTax() {
        EditText getTaxAmount = (EditText) findViewById(R.id.tax_percentage);
        String taxString = getTaxAmount.getText().toString();

        if (taxString.length() == 0) {
            taxPercentage = 0;
        } else {
            taxPercentage = Double.parseDouble(taxString);
        }

    }

    public void getTip() {
        EditText getTipAmount = (EditText) findViewById(R.id.tip_percentage);
        String tipString = getTipAmount.getText().toString();

        if (tipString.length() == 0) {
            tipPercentage = 0;
        } else {
            tipPercentage = Double.parseDouble(tipString);
        }

    }

    public void launchActivity(View view) {

        getAmount();
        getTax();
        getTip();
        Receipt r = new Receipt(amountInput, taxPercentage, tipPercentage);

        Intent intent = new Intent(this, DisplayReceipt.class);
        intent.putExtra(Keys.RECEIPT_KEY, r);
        startActivity(intent);
    }
}
