package com.example.inclassassignment06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutPainting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_painting);

       Intent intent = getIntent();
       Painting paint = (Painting) intent.getSerializableExtra(Keys.PAINTING_KEY);

        String painting = paint.paintingName;
        String artistText = paint.artistName;
        String aboutText = paint.aboutPainting;
        String inMuseum = String.valueOf(paint.inAMuseum);
        String age = String.valueOf(paint.museumAge);

        displayPainting(painting, artistText, inMuseum, aboutText, age);

    }

    private void displayText(String someText){
        TextView paintingDisplay = (TextView) findViewById(R.id.painting_display);
        paintingDisplay.setText(someText);
    }

    private void displayPainting(String painting, String artist, String inMuseum, String about, String age) {
        TextView paintingDisplay = (TextView) findViewById(R.id.painting_display);
        paintingDisplay.setText("Painting Name: " + painting);

        TextView artistDisplay = (TextView) findViewById(R.id.artist_display);
        artistDisplay.setText("Artist: " + artist);

        TextView inMuseumDisplay = (TextView) findViewById(R.id.in_museum_display);
        inMuseumDisplay.setText("Is this painting in a museum? " + inMuseum);

        TextView aboutDisplay = (TextView) findViewById(R.id.about_display);
        aboutDisplay.setText("About this Painting: " + about);

        TextView paintingAgeDisplay = (TextView) findViewById(R.id.painting_age_display);
        paintingAgeDisplay.setText("Age of Painting: " + age);
    }
}
