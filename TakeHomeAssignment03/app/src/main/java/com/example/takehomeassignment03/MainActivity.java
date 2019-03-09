package com.example.takehomeassignment03;

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

    int teamOneNumber = 0;
    int teamTwoNumber = 0;

    public void teamOneThree(View view) {
        teamOneNumber = teamOneNumber + 3;
        displayNewNumberOne(teamOneNumber);
    }

    public void teamOneTwo(View view) {
        teamOneNumber = teamOneNumber + 2;
        displayNewNumberOne(teamOneNumber);
    }

    public void teamOneFreeThrow(View view) {
        teamOneNumber = teamOneNumber + 1;
        displayNewNumberOne(teamOneNumber);
    }

    public void teamTwoThree(View view) {
        teamTwoNumber = teamTwoNumber + 3;
        displayNewNumberTwo(teamTwoNumber);
    }

    public void teamTwoTwo(View view) {
        teamTwoNumber = teamTwoNumber + 2;
        displayNewNumberTwo(teamTwoNumber);
    }

    public void teamTwoFreeThrow(View view) {
        teamTwoNumber = teamTwoNumber + 1;
        displayNewNumberTwo(teamTwoNumber);
    }

    public void resetBoth(View view) {
        teamOneNumber = 0;
        teamTwoNumber = 0;
        displayNewNumberTwo(teamTwoNumber);
        displayNewNumberOne(teamOneNumber);
    }


    private void displayNewNumberOne(int number) {
        TextView numberTextView = (TextView) findViewById(R.id.team_one_number);
        numberTextView.setText(String.valueOf(number));
    }

    private void displayNewNumberTwo(int number) {
        TextView numberTextView = (TextView) findViewById(R.id.team_two_number);
        numberTextView.setText(String.valueOf(number));
    }
}
