package com.example.inclasstest04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    private TextView questionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        Intent myIntent = getIntent();

        questionTextView = findViewById(R.id.answer_text_view);
        int questionResId = myIntent.getIntExtra("QUESTION_KEY", 0);
        questionTextView.setText(questionResId);



    }

}
