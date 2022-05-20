package com.example.learnmaoriapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardNumbers = (CardView) findViewById(R.id.card_numbers);
        cardNumbers.setOnClickListener(CardNumbersHandler);
        CardView cardFamily = (CardView) findViewById(R.id.card_family);
        cardFamily.setOnClickListener(CardFamilyHandler);
        CardView cardColors = (CardView) findViewById(R.id.card_colors);
        cardColors.setOnClickListener(CardColorsHandler);
    }

    View.OnClickListener CardNumbersHandler= new View.OnClickListener(){
        public void onClick(View view){
            Intent numbersActivity = new Intent(getBaseContext(),NumbersActivity.class);
            startActivity(numbersActivity);
        }
    };
    View.OnClickListener CardFamilyHandler= new View.OnClickListener(){
        public void onClick(View view){
            Intent familyActivity = new Intent(getBaseContext(),FamilyActivity.class);
            startActivity(familyActivity);
        }
    };
    View.OnClickListener CardColorsHandler= new View.OnClickListener(){
        public void onClick(View view){
            Intent colorsActivity = new Intent(getBaseContext(),ColorsActivity.class);
            startActivity(colorsActivity);
        }
    };



    public void ShowNumbersActivity(View view){

        //show numbers activity
        Intent numbersActivity = new Intent(this,NumbersActivity.class);
        startActivity(numbersActivity);
    }


}