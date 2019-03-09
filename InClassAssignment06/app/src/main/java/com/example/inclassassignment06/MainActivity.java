package com.example.inclassassignment06;

import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String paintingText;
    String artistText;
    String aboutText;
    boolean inMuseum = false;
    int age = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getPaintingText() {
        EditText getInputText = (EditText) findViewById(R.id.painting);
        paintingText = getInputText.getText().toString();
    }

    public void getArtistText() {
        EditText getInputText = (EditText) findViewById(R.id.artist);
        artistText = getInputText.getText().toString();
    }

    public void getAboutText() {
        EditText getInputText = (EditText) findViewById(R.id.about);
        aboutText = getInputText.getText().toString();
    }

    public void getAgeText() {
        EditText getInputText = (EditText) findViewById(R.id.painting_age);
        String ageString = getInputText.getText().toString();

        if (ageString.length() == 0){
            age = 0;
        }else{
            age = Integer.parseInt(ageString);
        }
    }

    public void isMuseumClicked(View view) {
        // Is the view now checked?
        CheckBox isItInMuseum = (CheckBox) findViewById(R.id.in_museum);
        inMuseum = isItInMuseum.isChecked();
    }

    public void launchActivity(View view) {

        getPaintingText();
        getArtistText();
        getAboutText();
        getAgeText();
        Painting p = new Painting(paintingText, artistText, inMuseum, aboutText, age);

        Intent intent = new Intent(this, AboutPainting.class);
        intent.putExtra(Keys.PAINTING_KEY, p);
        startActivity(intent);
    }

}
