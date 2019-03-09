package com.example.inclassassignment05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        if (MainActivity.titleOnly){
            setTitle(title);
        } else {
            displayMessage();
            setTitle(title);
        }
    }

    String userMessage = MainActivity.messageText;
    String title = MainActivity.titleText;

    private void displayMessage(){
        displayText(userMessage);
    }

    private void displayText(String inputText) {
        TextView userMessage = (TextView) findViewById(R.id.message_display);
        userMessage.setText(inputText);

    }
}
