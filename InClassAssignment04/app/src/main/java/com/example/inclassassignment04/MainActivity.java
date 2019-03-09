package com.example.inclassassignment04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String inputText;
    private int textSize = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   protected void onResume() {
        super.onResume();
        Toast t = Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT);
        t.show();

       // displayText(inputText);
    }

    public void copyButtonPressed(View view) {
        getInputText();
        displayText(inputText);
    }

    public void doubleButtonPressed(View view) {
        inputText = inputText + inputText;
        displayText(inputText);
    }

    public void getInputText() {
        EditText getInputText = (EditText) findViewById(R.id.text_input);
        inputText = getInputText.getText().toString();
    }

    public void displayText(String input) {
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
