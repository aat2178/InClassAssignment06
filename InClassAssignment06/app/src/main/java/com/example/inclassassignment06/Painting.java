package com.example.inclassassignment06;

import java.io.Serializable;

public class Painting implements Serializable {

    String paintingName;
    String artistName;
    boolean inAMuseum;
    String aboutPainting;
    int museumAge;

    public Painting(String name, String artist, boolean museum, String about, int age){
        paintingName = name;
        artistName = artist;
        inAMuseum = museum;
        aboutPainting = about;
        museumAge = age;
    }

}