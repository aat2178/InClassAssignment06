package com.example.inclassassignment03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Global variable for display number
    String displayNumber = "";

    /**
     * This method is called when the plus button is clicked.
     */
    public void numberOneButtonPressed(View view) {
        displayNumber = displayNumber + 1;
        displayNewNumber(displayNumber);
    }

    public void numberTwoButtonPressed(View view) {
        displayNumber = displayNumber + 2;
        displayNewNumber(displayNumber);
    }

    public void numberThreeButtonPressed(View view) {
        displayNumber = displayNumber + 3;
        displayNewNumber(displayNumber);
    }

    public void numberFourButtonPressed(View view) {
        displayNumber = displayNumber + 4;
        displayNewNumber(displayNumber);
    }

    public void numberFiveButtonPressed(View view) {
        displayNumber = displayNumber + 5;
        displayNewNumber(displayNumber);
    }

    public void numberSixButtonPressed(View view) {
        displayNumber = displayNumber + 6;
        displayNewNumber(displayNumber);
    }

    public void numberSevenButtonPressed(View view) {
        displayNumber = displayNumber + 7;
        displayNewNumber(displayNumber);
    }

    public void numberEightButtonPressed(View view) {
        displayNumber = displayNumber + 8;
        displayNewNumber(displayNumber);
    }

    public void numberNineButtonPressed(View view) {
        displayNumber = displayNumber + 9;
        displayNewNumber(displayNumber);
    }

    public void numberZeroButtonPressed(View view) {
        if (displayNumber.equals("")) {
            displayNewNumber("0");
        } else {
            displayNumber = displayNumber + 0;
            displayNewNumber(displayNumber);
        }
    }

    public void clearButtonPressed(View view) {
        displayNumber = "";
        displayNewNumber("0");
    }

    public void deleteButtonPressed(View view) {
        int numberLength = displayNumber.length() - 1;
        displayNumber = displayNumber.substring(0, numberLength);
        displayNewNumber(displayNumber);
    }

    private void displayNewNumber(String number) {
        TextView numberTextView = (TextView) findViewById(R.id.display_number);
        numberTextView.setText(number);
    }
}

