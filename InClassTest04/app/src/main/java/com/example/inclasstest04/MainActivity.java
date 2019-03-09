package com.example.inclasstest04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private Button trueButton;
    private Button falseButton;
    private TextView questionTextView;
    private ArrayList<Question> questionBank = new ArrayList<>();
    int currentIndex;
    private String currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MainActivity.this, "Hey Girl", Toast.LENGTH_LONG);
                //t.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                t.show();
            }
        });

        questionBank.add(new Question(R.string.australia_question, true));
        questionBank.add(new Question(R.string.pacific_question, true));
        questionBank.add(new Question(R.string.africa_question, true));
    }

    public void updateQuestion(View view) {
        currentIndex++;
        if (currentIndex < questionBank.size()){
            Question q = questionBank.get(currentIndex);
            questionTextView.setText(q.getTextResId());
        }
        else{
            Question q = questionBank.get(0);
            questionTextView.setText(q.getTextResId());
            currentIndex = 0;
        }

    }

    public void clickCheat(View view) {
        Intent intent = new Intent(this, CheatActivity.class);

        // pass a string to the second activity
        intent.putExtra("QUESTION_KEY", questionBank.get(currentIndex).getTextResId());
        startActivity(intent);

    }



}
