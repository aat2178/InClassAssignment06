package com.example.inclassassignment05;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    public static String titleText;
    public static String messageText;
    public static boolean titleOnly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getTitleText() {
        EditText getTitleText = (EditText) findViewById(R.id.title_input);
        titleText = getTitleText.getText().toString();
    }

    public void getMessageText() {
        EditText getInputText = (EditText) findViewById(R.id.message_input);
        messageText = getInputText.getText().toString();
    }

    public void titleOnlyClicked(View view) {
        // Is the view now checked?
        CheckBox getTitleOnly = (CheckBox) findViewById(R.id.only_send_title);
        titleOnly = getTitleOnly.isChecked();
    }

    public void sendEmailClicked(View view) {
        composeEmail();
    }

    public void launchCamera(View view) {
        capturePhoto();
    }

    public void composeEmail() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        getTitleText();
        getMessageText();

        if (titleOnly) {
            intent.putExtra(Intent.EXTRA_SUBJECT, titleText);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            intent.putExtra(Intent.EXTRA_TEXT, messageText);
            intent.putExtra(Intent.EXTRA_SUBJECT, titleText);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

    public void launchActivity(View view) {

        if (titleOnly) {
            getTitleText();
            Intent intent = new Intent(this, PopUpActivity.class);
            startActivity(intent);
        } else {
            getTitleText();
            getMessageText();
            Intent intent = new Intent(this, PopUpActivity.class);
            startActivity(intent);
        }

    }


    public void capturePhoto() {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }
}