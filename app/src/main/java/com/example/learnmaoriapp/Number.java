package com.example.learnmaoriapp;

import androidx.annotation.NonNull;

public class Number {
    private int digit;
    private String inconFiel;
    private  String translation;

    public Number(int digit, String inconFiel, String translation) {
        this.digit = digit;
        this.inconFiel = inconFiel;
        this.translation = translation;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public String getInconFiel() {
        return inconFiel;
    }

    public void setInconFiel(String inconFiel) {
        this.inconFiel = inconFiel;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
