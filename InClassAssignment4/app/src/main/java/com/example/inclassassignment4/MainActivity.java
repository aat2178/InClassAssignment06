package com.example.inclassassignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String inputText;
    public int textSize = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void copyButtonPressed(View view) {
        getInputText();
        displayText(inputText);
    }

    private void doubleButtonPressed(View view) {
        inputText = inputText + inputText;
        displayText(inputText);
    }

    private void getInputText() {
        EditText getInputText = (EditText) findViewById(R.id.text_input);
        inputText = getInputText.getText().toString();
    }

    private void displayText(String input) {
        TextView displayTextView = (TextView) findViewById(R.id.user_text);
        displayTextView.setText(input);
    }


    public void upButtonPressed(View view) {
        textSize += 2;
        TextView displayTextView = (TextView) findViewById(R.id.user_text);
        displayTextView.setTextSize(textSize);
    }

    public void downButtonPressed(View view) {
        textSize -= 2;
        TextView displayTextView = (TextView) findViewById(R.id.user_text);
        displayTextView.setTextSize(textSize);
    }

}

