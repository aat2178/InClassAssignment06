package com.example.takehomeassignment04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    // Global variable for quantity
    int userQuantity = 2;
    int whippedChecked = 0;
    int chocolateChecked = 0;
    String nameInput;
    boolean whippedCheckedBoolean = false;
    boolean chocolateCheckedBoolean = false;
    String whippedTrueFalse = "false";
    String chocolateTrueFalse = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        // Your code here
        if (userQuantity >= 100) {
            displayNumber(userQuantity);
        } else {
            userQuantity += 1;
            displayNumber(userQuantity);
        }
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        // Your code here
        if (userQuantity <= 1) {
            displayNumber(userQuantity);
        } else {
            userQuantity -= 1;
            displayNumber(userQuantity);
        }
    }

    /**
     * This method is called when the order button is clicked.
     *
     * @param view The View whose onclick attribute has the value "submitOrder"
     */
    public void submitOrder(View view) {
        // Your code here

       /* if (whippedCheckedBoolean) {
            whippedChecked = userQuantity;
            whippedTrueFalse = "true";
        }
        if (chocolateCheckedBoolean) {
            chocolateChecked = userQuantity;
            chocolateTrueFalse = "true";
        }
        int price = userQuantity * 5 + whippedChecked * 1 + chocolateChecked * 2;
        getInputText();
        displayMessageName("Name: " + nameInput);
        displayMessageWhipped("Add whipped cream? " + whippedTrueFalse);
        displayMessageChocolate("Add chocolate? " + chocolateTrueFalse);
        displayMessageQuantity("Quantity: " + userQuantity);
        displayPrice(price);
        displayMessageThanks("Thank you!");*/
       composeEmail();
    }

    /**
     * Display the given number in quantity_text_view.
     *
     * @param number The number to be displayed in quantity_text_view
     */
    private void displayNumber(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }

    public void getInputText() {
        EditText getInputText = (EditText) findViewById(R.id.name_input);
        nameInput = getInputText.getText().toString();
    }

    public void whippedCheckedClicked(View view) {
        // Is the view now checked?
        CheckBox getWhipped = (CheckBox) findViewById(R.id.whipped_cream);
        whippedCheckedBoolean = getWhipped.isChecked();
    }

    public void chocolateCheckedClicked(View view) {
        // Is the view now checked?
        CheckBox getChocolate = (CheckBox) findViewById(R.id.chocolate);
        chocolateCheckedBoolean = getChocolate.isChecked();
    }

    public void composeEmail() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        getInputText();
        if (whippedCheckedBoolean) {
            whippedChecked = userQuantity;
            whippedTrueFalse = "true";
        }
        if (chocolateCheckedBoolean) {
            chocolateChecked = userQuantity;
            chocolateTrueFalse = "true";
        }
        int price = userQuantity * 5 + whippedChecked * 1 + chocolateChecked * 2;
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.name) + nameInput + "\n"
                + getString(R.string.add_whipped) + whippedTrueFalse + "\n"
                + getString(R.string.add_chocolate) + chocolateTrueFalse + "\n" +
                getString(R.string.quantity_message) + userQuantity + "\n" +
                getString(R.string.total_message) + price + "\n" +
                getString(R.string.thanks_message));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
