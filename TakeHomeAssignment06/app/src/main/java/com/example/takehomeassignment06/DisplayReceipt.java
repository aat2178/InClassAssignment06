package com.example.takehomeassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_receipt);

        setTitle("Your Receipt");

        Intent intent = getIntent();
        Receipt receipt = (Receipt) intent.getSerializableExtra(Keys.RECEIPT_KEY);

        String grandTotal = String.valueOf((receipt.receiptAmount) +
                (receipt.receiptTax*receipt.receiptAmount) + (receipt.receiptAmount*receipt.receiptTip));
        String amount = String.valueOf(receipt.receiptAmount);
        String tax = String.valueOf(100* receipt.receiptTax);
        String tip = String.valueOf(receipt.receiptAmount * receipt.receiptTip);


        displayReceipt(amount, tax, tip, grandTotal);

    }


    private void displayReceipt(String amount, String tax, String tip, String grandTotalAmount) {

        TextView amountDisplay = (TextView) findViewById(R.id.total_display);
        amountDisplay.setText("Total: $" + amount +".00");

        TextView taxDisplay = (TextView) findViewById(R.id.tax_display);
        taxDisplay.setText("Sales Tax: " + tax +"%");

        TextView inMuseumDisplay = (TextView) findViewById(R.id.tip_display);
        inMuseumDisplay.setText("Tip: $" + tip + "0");

        TextView aboutDisplay = (TextView) findViewById(R.id.grand_total_display);
        aboutDisplay.setText("Grand Total: $" + grandTotalAmount + "0");
    }
}
